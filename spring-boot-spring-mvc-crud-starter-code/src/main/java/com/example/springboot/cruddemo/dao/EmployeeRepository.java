package com.example.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.cruddemo.leaf.entity.Employee;
 
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByLastNameAsc();
    // that's it ... no need to write any code LOL!

}
