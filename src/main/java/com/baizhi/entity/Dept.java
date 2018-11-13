package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Dept {
    private String id;
    private String no;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date bir;
    private String number;
    private String annotation;

    public Dept(String no, String name, Date bir, String number, String annotation) {
        this.no = no;
        this.name = name;
        this.bir = bir;
        this.number = number;
        this.annotation = annotation;
    }

    public Dept(String id, String no, String name, Date bir, String number, String annotation) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.bir = bir;
        this.number = number;
        this.annotation = annotation;
    }

    public Dept(String id, String no, String 资源部, String s, String number, String annotation) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", bir=" + bir +
                ", number='" + number + '\'' +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
