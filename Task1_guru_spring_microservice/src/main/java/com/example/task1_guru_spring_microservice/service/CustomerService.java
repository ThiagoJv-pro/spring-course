package com.example.task1_guru_spring_microservice.service;

import com.example.task1_guru_spring_microservice.dto.CustomerDTO;
import com.example.task1_guru_spring_microservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService implements CustomerRepository{


    @Override
    public CustomerDTO findById(UUID id) {
        return CustomerDTO.builder()
                .name("Thiago")
                .build();
    }

}
