package com.lifeshadow.springboottutorial.service;

import com.lifeshadow.springboottutorial.entity.Department;
import com.lifeshadow.springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartment();

    Department getDepartmentById(Long id) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long id);

    Department updateDepartmentById(Long id, Department department);

    Department getDepartmentsByName(String name);
}
