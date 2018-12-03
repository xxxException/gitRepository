package com.pointer.springbootdemo.mybatis.domin;

public class Permission {
    String name;
    String resource;
    Integer id;

    @Override
    public String toString() {
        return "Permission{" +
                "name='" + name + '\'' +
                ", resource='" + resource + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
