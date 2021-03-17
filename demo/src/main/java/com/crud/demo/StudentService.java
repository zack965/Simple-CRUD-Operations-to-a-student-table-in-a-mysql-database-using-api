package com.crud.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
    @Autowired
    private StudentRepository Studentrepository;


    public List<StudentEntity> GetStudents(){
        return Studentrepository.findAll();
    }
    public StudentEntity addStudent(StudentEntity std){
        return Studentrepository.save(std);
    }
    public StudentEntity FindStudent(int id){
        return Studentrepository.findById(id).orElse(null);
    }
    public String DeleteStudent(int id){
        Studentrepository.deleteById(id);
        return "Student Deleted !!"+id;
    }
    public StudentEntity StudentUpdate(StudentEntity std){
        StudentEntity ExistingStudent = Studentrepository.findById(std.getId()).orElse(null);
        ExistingStudent.setStudentGrp(std.getStudentGrp());
        ExistingStudent.setStudentName(std.getStudentName());
        return Studentrepository.save(ExistingStudent);
    }
}
