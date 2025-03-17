package org.sangam.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student student = new Student();
        student.setStudentName("Bob");
        student.setStudentAge(20);
        studentRepo.save(student);
    }
}
