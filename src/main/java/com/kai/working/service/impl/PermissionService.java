package com.kai.working.service.impl;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Permission;
import com.kai.working.repository.PermissionRepository;
import com.kai.working.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService implements IPermissionService {

    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public BaseResponse addPermission(Permission permission) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            permissionRepository.save(permission);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功新增一筆權限");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse deletePermission(Integer id){
        BaseResponse baseResponse = new BaseResponse();
        try {
            permissionRepository.deleteById(id);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功刪除一筆權限");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse updatePermission(Permission permission) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            permissionRepository.save(permission);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功修改一筆權限");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse selectPermission(Integer id){
        BaseResponse baseResponse = new BaseResponse();
        try {
            Permission permission = permissionRepository.getOne(id);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功查詢一筆權限");
            baseResponse.setResult(permission);
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
            List<Permission> permissionList = permissionRepository.findAll();
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功查詢全部權限");
            baseResponse.setResult(permissionList);
        }catch(Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }
}
