package com.study.phoebus.service;import com.study.phoebus.entity.Student;import java.util.List;public interface StudentService {    void insert(Student student);    List<Student> query(String name,int age);}