package com.pointer.springbootdemo.mybatis.domin;

public class Role {
    String name;
    String sn;
    Integer id;

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
