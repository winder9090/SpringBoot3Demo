package jingweng.demo.springboot3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Hello模块")
@RestController
public class HelloController {

    @Operation(summary = "向客人问好")
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
