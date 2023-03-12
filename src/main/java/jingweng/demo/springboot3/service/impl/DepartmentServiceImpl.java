package jingweng.demo.springboot3.service.impl;

import jingweng.demo.springboot3.entity.Department;
import jingweng.demo.springboot3.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jingweng.demo.springboot3.service.DepartmentService;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }
}
