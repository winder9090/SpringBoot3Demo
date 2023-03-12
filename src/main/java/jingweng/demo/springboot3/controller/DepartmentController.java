package jingweng.demo.springboot3.controller;

import jingweng.demo.springboot3.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jingweng.demo.springboot3.service.DepartmentService;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentServer;

    // 查询全部部门
    @GetMapping("/getDepartments")
    public List<Department> getDepartments(){
        return departmentServer.getDepartments();
    }
}