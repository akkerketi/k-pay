package ge.kerketi.kpay.service;


import ge.kerketi.kpay.payload.request.LoginRequest;
import ge.kerketi.kpay.payload.responce.AuthResponse;
import ge.kerketi.kpay.security.TokenProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final TokenProvider tokenProvider;

    public AuthService(AuthenticationManager authenticationManager, TokenProvider tokenProvider) {
        this.authenticationManager = authenticationManager;
        this.tokenProvider = tokenProvider;
    }

    public ResponseEntity<?> login(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = tokenProvider.createToken(authentication);
        return ResponseEntity.ok(new AuthResponse(token));
    }
}
