package com.pointer.springbootdemo.mybatis.domin;

public class Student  {
    private String studentName;

    private String studentAge;

    private Integer studentClass;

    private String studentNativaPlace;

    private Integer studentInstitute;

    private Integer studentTeacher;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentNativaPlace() {
        return studentNativaPlace;
    }

    public void setStudentNativaPlace(String studentNativaPlace) {
        this.studentNativaPlace = studentNativaPlace;
    }

    public Integer getStudentInstitute() {
        return studentInstitute;
    }

    public void setStudentInstitute(Integer studentInstitute) {
        this.studentInstitute = studentInstitute;
    }

    public Integer getStudentTeacher() {
        return studentTeacher;
    }

    public void setStudentTeacher(Integer studentTeacher) {
        this.studentTeacher = studentTeacher;
    }
}