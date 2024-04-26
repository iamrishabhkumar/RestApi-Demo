package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.repositary.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements EmployeeService{


    EmployeeRepository employeeRepository;
    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public String createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Created";
    }

    @Override
    public String updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Updated";
    }

    @Override
    public String deleteEmployee(String id) {
        employeeRepository.deleteById(id);
        return "deleted";
    }

    @Override
    public Employee getEmployee(String id) {
       return employeeRepository.findById(id).get();

    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
