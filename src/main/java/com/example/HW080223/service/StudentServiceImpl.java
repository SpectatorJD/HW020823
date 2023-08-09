package com.example.HW080223.service;

import com.example.HW080223.entities.Student;
import com.example.HW080223.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent (Student student){
        return studentRepository.save(student);
    }

    public Student findStudent(long id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(long id, Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

}
