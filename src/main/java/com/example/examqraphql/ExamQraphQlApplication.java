package com.example.examqraphql;

import com.example.examqraphql.entities.User;
import com.example.examqraphql.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ExamQraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamQraphQlApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public CommandLineRunner start(UserRepository userrepository){
        return args -> {
            userrepository.saveAll(List.of(
                    User.builder().name("Othmane1").email("Othmane1@gmail.com").password("123").dateNaissance("20/12/2001").build(),
                    User.builder().name("Othmane2").email("Othmane2@gmail.com").password("1234").dateNaissance("23/12/2001").build(),
                    User.builder().name("Othmane3").email("Othmane3@gmail.com").password("12345").dateNaissance("24/12/2001").build(),
                    User.builder().name("Othmane4").email("Othmane4@gmail.com").password("123456").dateNaissance("25/12/2001").build()
            ));
        };
    }
}
