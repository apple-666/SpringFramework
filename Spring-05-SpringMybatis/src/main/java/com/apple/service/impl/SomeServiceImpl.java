package com.apple.service.impl;

import com.apple.dao.StudentDao;
import com.apple.domain.Student;
import com.apple.service.SomeService;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/20 0:36
 * @Version 1.0
 */
public class SomeServiceImpl implements SomeService {

    private StudentDao studentDao;

    public SomeServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> queryStudent() {
        return studentDao.selectAll();
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }
}
