package com.rockburger.rocburapp.service;

import com.rockburger.rocburapp.entity.EmployeeModel;

public interface EmployeeService {
    EmployeeModel newEmployee (EmployeeModel newEmployee);
    Iterable<EmployeeModel> getAll();

}
