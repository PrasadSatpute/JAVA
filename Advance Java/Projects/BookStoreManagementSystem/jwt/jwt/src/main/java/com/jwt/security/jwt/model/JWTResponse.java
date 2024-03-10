package com.jwt.security.jwt.model;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JWTResponse {
    private String jwtToken;
    private String userName;
}
