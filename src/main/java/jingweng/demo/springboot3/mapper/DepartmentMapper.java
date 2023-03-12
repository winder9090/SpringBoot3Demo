package jingweng.demo.springboot3.mapper;

import jingweng.demo.springboot3.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> getDepartments();
}
