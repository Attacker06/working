package com.kai.working.service;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Employee;


public interface IEmployeeService {

    BaseResponse addEmployee(Employee employee);

    BaseResponse deleteEmployee(Integer id);

    BaseResponse updateEmployee(Employee employee);

    BaseResponse selectEmployee(Integer id);

    BaseResponse findAll();
}
