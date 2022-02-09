package io.sanchit.springjpa.repository;

import io.sanchit.springjpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
