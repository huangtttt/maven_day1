package com.baizhi.dao;

import com.baizhi.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptDao {
    List<Dept> findByPage(@Param("start") Integer start, @Param("rows") Integer rows);
    public void save(Dept dept);
    Long findTotals();
}
