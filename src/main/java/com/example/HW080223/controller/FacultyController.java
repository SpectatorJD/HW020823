package com.example.HW080223.controller;

import com.example.HW080223.entities.Faculty;
import com.example.HW080223.entities.Student;
import com.example.HW080223.service.FacultyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @GetMapping("{id}")
    public ResponseEntity<Faculty> getFacultyInfo(@PathVariable long id){
        Faculty faculty = facultyService.findFaculty(id);
        if (faculty==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }
    @PostMapping
    public Faculty createFaculty (@RequestBody Faculty faculty){
        return facultyService.addFaculty(faculty);
    }
    @PutMapping("{id}")
    public ResponseEntity<Faculty> editStudent(@RequestBody Faculty faculty, @PathVariable long id){
        Faculty foundFaculty = facultyService.editFaculty(id, faculty);
        if (foundFaculty == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundFaculty);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Faculty> deleteFaculty(@PathVariable long id){
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }
}
