package io.github.rajasekaranap.gmeettool.dao;

import io.github.rajasekaranap.gmeettool.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getStudentByRollNo(String rollNo);
    public Student getStudentByName(String name);
    public List<String> getGmeetNamesByName(String name);
    public List<String> getGmeetNamesByRollNo(String rollNo);
    public void addStudent(Student student);
    public void addStudent(String rollNo,String name,List<String> gmeetNames);
    public void addStudent(String rollNo,String name);
    public void addStudents(Map<String,String> rollNoNameMap);
    public boolean addGmeetName(String name, String gmeetName);
    public List<Student> getAllStudents();
}

