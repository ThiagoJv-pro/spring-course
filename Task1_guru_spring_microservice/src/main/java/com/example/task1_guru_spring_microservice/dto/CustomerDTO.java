package com.example.task1_guru_spring_microservice.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CustomerDTO {

    private UUID id;
    private String name;


}
