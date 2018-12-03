package com.pointer.springbootdemo.mybatis.queryObject;

import lombok.Data;

@Data
public class StudentQUeryObject extends BaseQueryObject{
    private String studentName;

    private String studentAge;

    private Integer studentClass;

    private String studentNativaPlace;

    private Integer studentInstitute;

    private Integer studentTeacher;

}
