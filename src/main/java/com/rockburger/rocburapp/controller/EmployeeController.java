package com.rockburger.rocburapp.controller;


import com.rockburger.rocburapp.entity.EmployeeModel;
import com.rockburger.rocburapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employeenew")
    public EmployeeModel newEmployee (@RequestBody EmployeeModel newEmployee){
        return employeeService.newEmployee(newEmployee);
    }

    @GetMapping("/employees")
    public Iterable<EmployeeModel> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/employeemodi")
    public EmployeeModel updateEmployee (@RequestBody EmployeeModel employeeModel){
        return employeeService.modifyEmployee(employeeModel);
    }
    @PostMapping("/employeedel/{id}")
    public Boolean deleteEmployee (@PathVariable (value="id") Long id){
        return employeeService.deleteEmployee(id);
    }


}
