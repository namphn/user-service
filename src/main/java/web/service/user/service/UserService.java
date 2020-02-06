package web.service.user.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import web.service.grpc.LoginRequest;
import web.service.grpc.LoginResponse;
import web.service.user.model.UserDetailCustom;

@Service
public class UserService {

    private final AuthenticationManager authenticationManager;
    private final UserDetailServiceCustom userDetailServiceCustom;
    private final JwtTokenProvider jwtTokenProvider;

    public UserService(AuthenticationManager authenticationManager, UserDetailServiceCustom userDetailServiceCustom, JwtTokenProvider jwtTokenProvider) {
        this.authenticationManager = authenticationManager;
        this.userDetailServiceCustom = userDetailServiceCustom;
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public LoginResponse authenticateUser(LoginRequest loginRequest){

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    loginRequest.getEmail(),
                    loginRequest.getPassword()
            ));
        final UserDetailCustom userDetails = userDetailServiceCustom.loadUserByEmail(loginRequest.getEmail());
        final String token = jwtTokenProvider.generateToken(userDetails);
        LoginResponse.Builder response = LoginResponse.newBuilder();
        response.setStatus("jwt have created");
        response.setToken(token);
        return response.build();
    }
}
