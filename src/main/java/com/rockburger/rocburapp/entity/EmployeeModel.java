package com.rockburger.rocburapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeeModel {
    @Id
    @Column
    private Long id_employee;
    @Column
    private String id_number;
    @Column
    private String emp_name;
    @Column
    private String emp_surname;
}
