package com.kai.working.controller;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Employee;
import com.kai.working.service.IEmployeeService;
import com.kai.working.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kai.working.entity.Permission;

@RestController
public class PermissionController {
    @Autowired
    IPermissionService permissionService;

    @PostMapping("permission/addPermission")
    private BaseResponse addPermission(@RequestBody Permission permission){
        return permissionService.addPermission(permission);
    }

    @DeleteMapping("permission/deletePermission")
    private BaseResponse deletePermission(@RequestParam Integer id){
        return permissionService.deletePermission(id);
    }

    @PostMapping("permission/updatePermission")
    private BaseResponse updatePermission(@RequestBody Permission permission){
        return permissionService.updatePermission(permission);
    }

    @GetMapping("permission/selectPermission")
    private BaseResponse selectPermission(@RequestParam Integer id){
        return permissionService.selectPermission(id);
    }

    @GetMapping("permission/findAll")
    private BaseResponse findAllWork(){
        return permissionService.findAll();
    }
}
