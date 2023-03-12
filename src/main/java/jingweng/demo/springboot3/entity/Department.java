package jingweng.demo.springboot3.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {

    private Integer id;
    private String departmentName;

}
