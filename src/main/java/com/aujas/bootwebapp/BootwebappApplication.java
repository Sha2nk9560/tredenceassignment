package com.aujas.bootwebapp;

import com.aujas.bootwebapp.model.Address;
import com.aujas.bootwebapp.model.Laptop;
import com.aujas.bootwebapp.model.Student;
import com.aujas.bootwebapp.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BootwebappApplication {


    public static void main(String[] args) {
        SpringApplication.run(BootwebappApplication.class, args);



    }


    @Bean
    public ModelMapper modelMapper() {

        return new ModelMapper();
    }
}
