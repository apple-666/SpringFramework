package com.apple.domain;

/**
 * @Author Double_apple
 * @Date 2022/1/20 0:27
 * @Version 1.0
 */
public class Student {

    private int id;
    private int stdno;
    private String stdname;
    private int classno;

    public Student() {
    }

    public Student(int id, int stdno, String stdname, int classno) {
        this.id = id;
        this.stdno = stdno;
        this.stdname = stdname;
        this.classno = classno;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStdno() {
        return stdno;
    }

    public void setStdno(int stdno) {
        this.stdno = stdno;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stdno=" + stdno +
                ", stdname='" + stdname + '\'' +
                ", classno=" + classno +
                '}';
    }
}
