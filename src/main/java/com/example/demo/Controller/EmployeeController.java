package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
      EmployeeService employeeService;
      public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
      }


        Employee employee;
        @GetMapping("{id}")
        public Employee getEmployeeDetails(@PathVariable("id") String id){
          return employeeService.getEmployee(id);

        }
        @GetMapping()
         public List<Employee> getAllEmployeeDetails(){
        return employeeService.getAllEmployee();

        }
        @PostMapping
        public String addEmployee(@RequestBody Employee employee){
            employeeService.createEmployee(employee);
            return "Success";
        }
        @PutMapping
        public String updateEmployee(@RequestBody Employee employee){
            employeeService.updateEmployee(employee);
            return "Updated";
        }
        @DeleteMapping("{id}")
        public String deleteEmployee(@PathVariable("id") String id){
            employeeService.deleteEmployee(id);
            return "Deleted";
        }
}
