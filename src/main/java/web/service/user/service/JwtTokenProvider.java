package web.service.user.service;

import io.jsonwebtoken.*;
import web.service.user.model.UserDetailCustom;

import java.util.Date;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class JwtTokenProvider {
    private final String JWT_SCRET = "lBkt8u0eBIKr0";

    private final long JWT_EXPIRATION = 60480000L;

    /** tạo chuỗi token */
    public String generateToken(UserDetailCustom userDetailCustom){
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);

        return Jwts.builder()
                .setSubject(userDetailCustom.getUser().getEmail())
                .setIssuedAt(now)
                .signWith(SignatureAlgorithm.HS512, JWT_SCRET)
                .compact();
    }

    /** kiểm tra token */
    public boolean validateToken(String token){
        try {
            Jwts.parser().setSigningKey(JWT_SCRET).parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException ex){
            log.print("Invalid JWT Token");
        } catch (ExpiredJwtException ex){
            log.print("Expired JWT Token");
        } catch (UnsupportedJwtException ex) {
            log.print("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            log.print("JWT claims string is empty.");
        }
        return false;
    }

    /** lấy email của user */
    public String getUserEmailFromJwt(String oauthToken){
        Claims claims = Jwts.parser()
                            .setSigningKey(JWT_SCRET)
                            .parseClaimsJws(oauthToken)
                            .getBody();

        return claims.getSubject();
    }
}
