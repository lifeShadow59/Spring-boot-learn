package com.lifeshadow.springboottutorial.service;


import com.lifeshadow.springboottutorial.entity.Department;
import com.lifeshadow.springboottutorial.error.DepartmentNotFoundException;
import com.lifeshadow.springboottutorial.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired()
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
    public Department getDepartmentById(Long id) throws DepartmentNotFoundException {

        Optional<Department> department =
                this.departmentRepository.findById(id);
        if (department.isEmpty()) {
            this.logger.info("Department not found. id: " + id);
            throw new DepartmentNotFoundException("Department not found");

        }
        this.logger.info("Department found successfully. id: " + id);
        return department.get();
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
