package com.pointer.springbootdemo.mybatis.domin;

public class Course extends CourseKey {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}