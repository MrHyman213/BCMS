package org.hyman.BCMS.security;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.BodyError;
import org.hyman.BCMS.dto.JwtRequest;
import org.hyman.BCMS.dto.JwtResponse;
import org.hyman.BCMS.util.JWTUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager manager;
    private final UserService userService;
    private final JWTUtil jwtUtil;

    public ResponseEntity<?> createAuthToken(JwtRequest request){
        try {
            manager.authenticate(new UsernamePasswordAuthenticationToken(request.getName(), request.getPassword()));
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(new BodyError(HttpStatus.UNAUTHORIZED.value(),
                    "Неправильный логин или пароль"), HttpStatus.UNAUTHORIZED);
        }
        return ResponseEntity.ok(
                new JwtResponse(jwtUtil.generateToken(userService.loadUserByUsername(request.getName()))));
    }
}
