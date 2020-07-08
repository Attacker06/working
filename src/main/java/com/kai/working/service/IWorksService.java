package com.kai.working.service;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Works;

public interface IWorksService {

    BaseResponse addWork(Works works);

    BaseResponse deleteWork(Integer id);

    BaseResponse updateWork(Works works);

    BaseResponse selectWork(Integer id);

    BaseResponse findAll();

    BaseResponse checkWork(Integer id);
}
