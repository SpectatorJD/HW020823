package com.example.HW080223.repositories;

import com.example.HW080223.entities.Student;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository <Student, Long> {
}
