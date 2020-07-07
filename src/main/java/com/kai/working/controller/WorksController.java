package com.kai.working.controller;

import com.kai.working.Response.BaseResponse;
import com.kai.working.entity.Works;
import com.kai.working.service.IWorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WorksController {

    @Autowired
    IWorksService worksService;

    @PostMapping("works/addWork")
    private BaseResponse addWork(@RequestBody Works works){
        return worksService.addWork(works);
    }

    @DeleteMapping("works/deleteWork")
    private BaseResponse deleteWork(@RequestParam Integer id){
        return worksService.deleteWork(id);
    }

    @PostMapping("works/updateWork")
    private BaseResponse updateWork(@RequestBody Works works){
        return worksService.updateWork(works);
    }

    @GetMapping("works/selectWork")
    private BaseResponse selectWork(@RequestParam Integer id){
        return worksService.selectWork(id);
    }

    @GetMapping("works/findAll")
    private BaseResponse findAllWork(){
        return worksService.findAll();
    }
}
