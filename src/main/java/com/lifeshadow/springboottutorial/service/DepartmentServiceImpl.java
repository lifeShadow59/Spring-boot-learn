package com.lifeshadow.springboottutorial.service;


import com.lifeshadow.springboottutorial.entity.Department;
import com.lifeshadow.springboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return this.departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentById(Long id) {
        this.departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartmentById(Long id, Department department) {
        final Department db = departmentRepository.findById(id).get();
        db.setDepartmentAddress(department.getDepartmentAddress());
        db.setDepartmentName(department.getDepartmentName());
        db.setDepartmentCode(department.getDepartmentCode());
        return this.departmentRepository.save(db);
    }

    @Override
    public Department getDepartmentsByName(String departmentName) {
        return this.departmentRepository.findByDepartmentName(departmentName);
    }
}
