package com.kai.working.service.impl;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Works;
import com.kai.working.repository.WorkRepository;
import com.kai.working.service.IWorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksService implements IWorksService {

    @Autowired
    WorkRepository workRepository;

    @Override
    public BaseResponse addWork(Works works) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            workRepository.save(works);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功新增一筆加班");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse deleteWork(Integer id){
        BaseResponse baseResponse = new BaseResponse();
        try {
            workRepository.deleteById(id);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功刪除一筆加班");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse updateWork(Works works) {
        BaseResponse baseResponse = new BaseResponse();
        try{
            workRepository.save(works);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功修改一筆加班");
        }catch (Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }

    @Override
    public BaseResponse selectWork(Integer id){
        BaseResponse baseResponse = new BaseResponse();
        try {
            Works works = workRepository.getOne(id);
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功查詢一筆加班");
            baseResponse.setResult(works);
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
            List<Works> worksList = workRepository.findAll();
            baseResponse.setStatus("200");
            baseResponse.setMessage("成功查詢全部加班");
            baseResponse.setResult(worksList);
        }catch(Exception e){
            baseResponse.setStatus("500");
            baseResponse.setMessage("失敗");
            baseResponse.setResult(e);
        }
        return baseResponse;
    }
}
