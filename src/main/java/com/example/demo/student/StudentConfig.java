package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student sergey = new Student(
				"Sergey",
				"sergey.milinkovic@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5)
			);

            Student ruben = new Student(
				"Ruben",
				"ruben.neves@gmail.com",
				LocalDate.of(2001, Month.JULY, 4)
			);

            repository.saveAll(
                List.of(sergey, ruben)
            );
        };
    }
}
