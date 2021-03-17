package com.crud.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="StudentTb")
public class StudentEntity {
    @Id
    @GeneratedValue
    private int Id;
    private String StudentName;
    private String StudentGrp;

    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        this.Id = id;
    }
    public String getStudentGrp() {
        return StudentGrp;
    }
    public void setStudentGrp(String studentGrp) {
        this.StudentGrp = studentGrp;
    }
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

}
