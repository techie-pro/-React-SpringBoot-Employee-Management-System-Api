package com.techiepro.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techiepro.employee.entity.EmployeeEntity;



@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long>{

}
