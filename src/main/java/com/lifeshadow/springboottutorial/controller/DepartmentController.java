package com.lifeshadow.springboottutorial.controller;

import com.lifeshadow.springboottutorial.entity.Department;
import com.lifeshadow.springboottutorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        this.logger.info("Inside save department of DepartmentController.");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        this.logger.info("Inside get department of DepartmentController.");
        return  this.departmentService.getAllDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        this.logger.info("Inside get department of DepartmentController.");
        return  this.departmentService.getDepartmentById(id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        this.logger.info("Inside delete department of DepartmentController.");
        this.departmentService.deleteDepartmentById(id);
        this.logger.info("Delete department successfully " + id);
        return "Department delete successfully.";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long id, @RequestBody Department department){
        return this.departmentService.updateDepartmentById(id, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department getDepartmentsByName(@PathVariable("name") String name){
        return this.departmentService.getDepartmentsByName(name);
    }

}
