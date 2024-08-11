package io.github.raphonzius.demospringsecurity6jwt.web;

import io.github.raphonzius.demospringsecurity6jwt.security.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("authenticate")
    public String authenticate(Authentication auth) {
        return authenticationService.authenticate(auth);
    }
}
