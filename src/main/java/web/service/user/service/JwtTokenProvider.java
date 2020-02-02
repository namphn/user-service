package web.service.user.service;

import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.service.user.model.UserDetailCustom;
import java.util.Date;

@Component
@Slf4j
public class JwtTokenProvider {
    private final String JWT_SECRET = "lBkt8u0eBIKr0";

    private final long JWT_EXPIRATION = 60480000L;

    /** tạo chuỗi token */
    public String generateToken(UserDetailCustom userDetailCustom){
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);

        return Jwts.builder()
                .setSubject(userDetailCustom.getUser().getEmail())
                .setIssuedAt(now)
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
    public String getUserEmailFromJwt(String oauthToken){
        Claims claims = Jwts.parser()
                            .setSigningKey(JWT_SECRET)
                            .parseClaimsJws(oauthToken)
                            .getBody();

        return claims.getSubject();
    }
}
