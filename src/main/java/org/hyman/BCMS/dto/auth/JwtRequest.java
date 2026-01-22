package org.hyman.BCMS.dto.auth;

import lombok.Data;

@Data
public class JwtRequest {

    private String name;
    private String password;
}
