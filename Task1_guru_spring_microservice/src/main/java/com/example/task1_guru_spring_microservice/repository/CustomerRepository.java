package com.example.task1_guru_spring_microservice.repository;

import com.example.task1_guru_spring_microservice.dto.CustomerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository  {


    CustomerDTO findById(UUID id);
}
