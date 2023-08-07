package com.example.hr1.model.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hr1.model.employees.entity.EmployeesEntity;

import java.util.List;
import java.util.Optional;


public interface EmployeesRepository extends JpaRepository<EmployeesEntity, Integer> {
    Optional<EmployeesEntity> findByEmployeeId(Integer employeeId);
    
    List<EmployeesEntity> findByFirstNameContainingIgnoreCase(String firstName);
}
