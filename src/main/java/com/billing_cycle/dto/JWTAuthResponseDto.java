package com.billing_cycle.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class JWTAuthResponseDto {
    private String token;
    private String type = "Bearer";
    private String email;
}
