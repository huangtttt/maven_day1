package com.baizhi.service;

import com.baizhi.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findByPage(Integer page, Integer rows);
    public void save(Dept dept);
    Long findTotal();
}
