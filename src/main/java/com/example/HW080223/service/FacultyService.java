package com.example.HW080223.service;

import com.example.HW080223.entities.Faculty;


public interface FacultyService {
    Faculty addFaculty (Faculty faculty);
    Faculty findFaculty (long id);
    Faculty editFaculty (long id, Faculty faculty);
    void deleteFaculty (long id);
}
