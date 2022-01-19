package com.apple.dao;

import com.apple.domain.Student;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/20 0:30
 * @Version 1.0
 */
public interface StudentDao {
    List<Student> selectAll();
    int insertStudent(Student student);
}
