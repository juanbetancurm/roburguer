package com.rockburger.rocburapp.service.implementation;

import com.rockburger.rocburapp.dto.EmployeeDto;
import com.rockburger.rocburapp.entity.EmployeeModel;
import com.rockburger.rocburapp.mapper.EmployeeMapper;
import com.rockburger.rocburapp.repository.EmployeeRepository;
import com.rockburger.rocburapp.service.EmployeeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public EmployeeModel modifyEmployee (EmployeeModel employeeModel){
        Optional<EmployeeModel> employeeFound = employeeRepository.findById(employeeModel.getId_employee());
        if(employeeFound.isPresent()){
            EmployeeModel employeeModelModify = employeeFound.get();
            employeeModelModify.setId_number(employeeModel.getId_number());
            employeeModelModify.setEmp_name(employeeModel.getEmp_name());
            employeeModelModify.setEmp_surname(employeeModel.getEmp_surname());
                return  employeeRepository.save(employeeModelModify);
        } else {
            throw new EntityNotFoundException("Employee with id "+employeeModel.getId_employee()+" not found.");
        }
    }
    @Override
    public Boolean deleteEmployee (Long id_employee){
        if (employeeRepository.existsById(id_employee)){
            employeeRepository.deleteById(id_employee);
            return true;
        }else {
            throw new EntityNotFoundException("Employee with id "+id_employee+" not found.");
        }
    }

    public Optional<EmployeeDto> getById(Long id){
        Optional<EmployeeModel> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            EmployeeModel employeeModel = employeeOptional.get();
            EmployeeDto employeeDto = EmployeeMapper.INSTANCE.EmployeeModelToEmployeeDto(employeeModel);
            return Optional.of(employeeDto);
        }else {
            throw new EntityNotFoundException("Employee with id "+id+" not found.");
        }

    }


}
