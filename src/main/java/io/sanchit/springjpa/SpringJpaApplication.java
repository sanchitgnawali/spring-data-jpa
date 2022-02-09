package io.sanchit.springjpa;

import io.sanchit.springjpa.entity.Student;
import io.sanchit.springjpa.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
          Student sanchit = new Student("Sanchit", "Gnawali", "sanchit@sanchit.io", 100);
          studentRepository.save(sanchit);
        };
    }
}
