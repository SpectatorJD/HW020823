package com.example.HW080223.service;

import com.example.HW080223.entities.Faculty;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FacultyServiceImpl implements FacultyService {
    private final  HashMap<Long , Faculty> faculties = new HashMap<>();
    private  long count = 0;

    @Override
    public Faculty addFaculty(Faculty faculty) {
        faculty.setId(count++);
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty findFaculty(long id) {
        return faculties.get(id);

    }

    @Override
    public Faculty editFaculty(long id, Faculty faculty) {
        if (!faculties.containsKey(id)){
            return null;
        }
        faculties.put(id, faculty);
        return faculty;
    }

    @Override
    public void deleteFaculty(long id) {
        faculties.remove(id);

    }
}
