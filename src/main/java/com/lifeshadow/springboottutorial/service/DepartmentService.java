package com.lifeshadow.springboottutorial.service;

import com.lifeshadow.springboottutorial.entity.Department;
import com.lifeshadow.springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartment();

    public Department getDepartmentById(Long id) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long id);

    public Department updateDepartmentById(Long id, Department department);

    public Department getDepartmentsByName(String name);
}
