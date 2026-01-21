package org.hyman.BCMS.dto;

import lombok.Data;

@Data
public class JwtRequest {

    private String name;
    private String password;
}
