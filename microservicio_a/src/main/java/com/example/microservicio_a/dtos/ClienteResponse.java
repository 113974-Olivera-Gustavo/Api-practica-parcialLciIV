package com.example.microservicio_a.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteResponse {
    private Long id;
    private String secret;

}
