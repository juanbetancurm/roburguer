package com.rockburger.rocburapp.service.implementation;

import com.rockburger.rocburapp.entity.EmployeeModel;
import com.rockburger.rocburapp.repository.EmployeeRepository;
import com.rockburger.rocburapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeModel newEmployee (EmployeeModel newEmployee) {
        return employeeRepository.save(newEmployee);

    }
    @Override
    public Iterable<EmployeeModel> getAll() {
        return this.employeeRepository.findAll();
    }
}
