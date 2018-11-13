package com.baizhi.service;

import com.baizhi.dao.DeptDao;
import com.baizhi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Controller
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Dept> findByPage(Integer page, Integer rows) {
        int start=(page-1)*rows;
        return deptDao.findByPage(start,rows);
    }

    @Override
    public void save(Dept dept) {
        dept.setId(UUID.randomUUID().toString());
        deptDao.save(dept);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Long findTotal() {
        return deptDao.findTotals();

    }
}
