package com.jwt.security.jwt.model;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JWTRequest {
    private String userID;
    private String password;
}
