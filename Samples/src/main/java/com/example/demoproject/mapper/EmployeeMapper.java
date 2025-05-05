package com.example.demoproject.mapper;

import com.example.demoproject.dto.EmployeeDto;
import com.example.demoproject.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getMiddlename(),
                employee.getLastname(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstname(),
                employeeDto.getMiddlename(),
                employeeDto.getLastname(),
                employeeDto.getEmail()

        );

    }
}
