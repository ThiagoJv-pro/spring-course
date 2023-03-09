package com.example.task1_guru_spring_microservice.controller;

import com.example.task1_guru_spring_microservice.dto.CustomerDTO;
import com.example.task1_guru_spring_microservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;
@GetMapping("/{id}")
    public CustomerDTO findById(@PathVariable UUID id){
        return customerRepository.findById(id);
    }


}
