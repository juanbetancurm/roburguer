package com.rockburger.rocburapp.service;

import com.rockburger.rocburapp.dto.EmployeeDto;
import com.rockburger.rocburapp.entity.EmployeeModel;

import java.util.Optional;

public interface EmployeeService {
    EmployeeModel newEmployee (EmployeeModel newEmployee);
    Iterable<EmployeeModel> getAll();
    EmployeeModel modifyEmployee (EmployeeModel employeeModel);
    Boolean deleteEmployee(Long id_employee);
    Optional<EmployeeDto> getById(Long id);
}
