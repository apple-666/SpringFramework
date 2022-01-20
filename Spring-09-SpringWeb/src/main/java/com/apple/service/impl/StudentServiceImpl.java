package com.apple.service.impl;

import com.apple.dao.StudentDao;
import com.apple.domain.Student;
import com.apple.service.StudentService;

import java.util.List;

/**
 * @Author Double_apple
 * @Date 2022/1/20 0:36
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    //使用 set注入
    public void setStudentDao(StudentDao studentDao) {
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
