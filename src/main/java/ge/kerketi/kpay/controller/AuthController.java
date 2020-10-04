package ge.kerketi.kpay.controller;

import ge.kerketi.kpay.payload.request.LoginRequest;
import ge.kerketi.kpay.service.AuthService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authenticate;

    public AuthController(AuthService authenticate) {
        this.authenticate = authenticate;
    }

    @ApiOperation(value = "login")
    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        return authenticate.login(loginRequest);
    }

}
