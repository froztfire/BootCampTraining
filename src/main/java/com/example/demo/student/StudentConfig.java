package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;
import static java.time.Month.JANUARY;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jerome = new Student(
                    "Jerome",
                    "jeromegarcia.16@gmail.com",
                    LocalDate.of(1988, MAY, 22));


            Student Jhaz = new Student(
                    "Jhaz",
                    "llecahj_aytum.16@yahoo.com",
                    LocalDate.of(1989, JANUARY, 20));

            repository.saveAll(List.of(jerome,Jhaz));
        };
    }
}
