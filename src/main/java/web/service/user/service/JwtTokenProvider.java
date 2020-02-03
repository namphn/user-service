package web.service.user.service;

import io.jsonwebtoken.*;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import web.service.user.model.UserDetailCustom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Component
@Slf4j
@NoArgsConstructor
public class JwtTokenProvider {

    private final long serialVersionUID = -2550185165626007488L;

    private final String JWT_SECRET = "lBkt8u0eBIKr0";

    private final long JWT_EXPIRATION = 60480000L;

    /** tạo chuỗi token */
    public String generateToken(UserDetailCustom userDetailCustom){
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);

        return Jwts.builder()
                .setSubject(userDetailCustom.getUser().getUserName())
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                .compact();
    }

    /** kiểm tra token */
    public boolean validateToken(String token){
        try {
            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException ex){
            log.error("Invalid JWT Token");
        } catch (ExpiredJwtException ex){
            log.error("Expired JWT Token");
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            log.error("JWT claims string is empty.");
        }
        return false;
    }

    /** lấy email của user */

    public String getUsernameFromToken(String token) throws NoSuchAlgorithmException {

        return getClaimFromToken(token, Claims::getSubject);

    }

    public Date getExpirationDateFromToken(String token) throws NoSuchAlgorithmException {

        return getClaimFromToken(token, Claims::getExpiration);

    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) throws NoSuchAlgorithmException {

        final Claims claims = getAllClaimsFromToken(token);

        return claimsResolver.apply(claims);

    }
    private Boolean isTokenExpired(String token) throws NoSuchAlgorithmException {

        final Date expiration = getExpirationDateFromToken(token);

        return expiration.before(new Date());

    }


    public String generateToken(UserDetails userDetails) {

        Map<String, Object> claims = new HashMap<>();

        return doGenerateToken(claims, userDetails.getUsername());

    }

    private String doGenerateToken(Map<String, Object> claims, String subject) {

        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))

                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION * 1000))

                .signWith(SignatureAlgorithm.HS512, JWT_SECRET).compact();

    }


    public Boolean validateToken(String token, UserDetails userDetails) throws NoSuchAlgorithmException {
        System.out.println(userDetails.getUsername());
        final String username = getUsernameFromToken(token);

        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));

    }
    private Claims getAllClaimsFromToken(String token) throws  NoSuchAlgorithmException {
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
        String compactJws = Jwts.builder()
                .setSubject("Joe")
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();


        Claims claims = Jwts.parser().setSigningKey(secretKey)
                .parseClaimsJws(compactJws).getBody();

//        return Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
        return claims;

    }


}
