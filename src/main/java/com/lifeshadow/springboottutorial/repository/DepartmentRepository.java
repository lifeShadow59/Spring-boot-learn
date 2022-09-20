package com.lifeshadow.springboottutorial.repository;

import com.lifeshadow.springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String name);

    public Department findByDepartmentNameIgnoreCase(String name);
}
