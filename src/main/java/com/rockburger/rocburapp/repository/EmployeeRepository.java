package com.rockburger.rocburapp.repository;

import com.rockburger.rocburapp.entity.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {
}
