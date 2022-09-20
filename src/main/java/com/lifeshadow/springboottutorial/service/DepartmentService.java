package com.lifeshadow.springboottutorial.service;

import com.lifeshadow.springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartment();

    public Department getDepartmentById(Long id);

    public void deleteDepartmentById(Long id);

    public Department updateDepartmentById(Long id, Department department);

    public Department getDepartmentsByName(String name);
}
