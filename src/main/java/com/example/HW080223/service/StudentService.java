package com.example.HW080223.service;

import com.example.HW080223.entities.Student;

public interface StudentService {
    Student addStudent (Student student);
    Student findStudent (long id);
    Student editStudent (long id, Student student);
    void deleteStudent (long id);

}
