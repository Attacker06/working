package com.kai.working.service;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Permission;

public interface IPermissionService {

    BaseResponse addPermission(Permission permission);

    BaseResponse deletePermission(Integer id);

    BaseResponse updatePermission(Permission permission);

    BaseResponse selectPermission(Integer id);

    BaseResponse findAll();
}
