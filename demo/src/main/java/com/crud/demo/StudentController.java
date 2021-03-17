package com.crud.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public List<StudentEntity> GetAllStudents(){
        return studentService.GetStudents();
    }
    @RequestMapping("/student/{id}")
    public StudentEntity GetStudent(@PathVariable("id") int id){
        return studentService.FindStudent(id);
    }
    @RequestMapping(method=RequestMethod.POST,value="/student")
    public StudentEntity AddStudent(@RequestBody StudentEntity std){
        return studentService.addStudent(std);
    }

    @RequestMapping(method=RequestMethod.PUT,value="/student")
    public StudentEntity UpdateStudent(@RequestBody StudentEntity std){
        return studentService.StudentUpdate(std);
    }
    
    @DeleteMapping("/Deletestd/{id}")
    public String DeleteStudent(@PathVariable int id){
        return studentService.DeleteStudent(id);
    }
}
