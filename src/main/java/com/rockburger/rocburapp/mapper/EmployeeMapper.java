package com.rockburger.rocburapp.mapper;

import com.rockburger.rocburapp.dto.EmployeeDto;
import com.rockburger.rocburapp.entity.EmployeeModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDto EmployeeModelToEmployeeDto (EmployeeModel employeeModel);
    EmployeeModel EmployeeDtoToEmployeeModel (EmployeeDto employeeDto);
}
