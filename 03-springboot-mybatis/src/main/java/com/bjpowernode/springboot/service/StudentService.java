package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public int update();
}
