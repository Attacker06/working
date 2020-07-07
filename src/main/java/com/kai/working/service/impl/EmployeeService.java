package com.kai.working.service.impl;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Employee;
import com.kai.working.repository.EmployeeRepository;
import com.kai.working.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public BaseResponse addEmployee(Employee employee) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            employeeRepository.save(employee);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功新增一筆員工資料");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse deleteEmployee(Integer id){
        BaseResponse baseResponse = new BaseResponse();
        try {
            employeeRepository.deleteById(id);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功刪除一筆員工資料");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse updateEmployee(Employee employee) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            employeeRepository.save(employee);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功修改一筆員工資料");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse selectEmployee(Integer id){
        BaseResponse baseResponse = new BaseResponse();
        try {
            Employee employee = employeeRepository.getOne(id);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功查詢一筆員工資料");
            baseResponse.setResult(employee);
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse findAll(){
        BaseResponse baseResponse = new BaseResponse();
        try {
            List<Employee> employeeList = employeeRepository.findAll();
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功查詢全部加班");
            baseResponse.setResult(employeeList);
        }catch(Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }
}
