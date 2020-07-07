package com.kai.working.controller;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Employee;
import com.kai.working.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    @PostMapping("employee/addEmployee")
    private BaseResponse addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("employee/deleteEmployee")
    private BaseResponse deleteWork(@RequestParam Integer id){
        return employeeService.deleteEmployee(id);
    }

    @PostMapping("employee/updateEmployee")
    private BaseResponse updateWork(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("employee/selectEmployee")
    private BaseResponse selectWork(@RequestParam Integer id){
        return employeeService.selectEmployee(id);
    }

    @GetMapping("employee/findAll")
    private BaseResponse findAllWork(){
        return employeeService.findAll();
    }
}
