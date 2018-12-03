package com.pointer.springbootdemo.mybatis.queryObject;

public class BaseQueryObject {
    //用于分页的信息
    private int current = 1;
    private int pageSize = 3;

    //分页查询,用于LIMIT
    public int getStart(){
        return (current-1)*pageSize;
    }
}
