package com.example.springbootdocker.controller;

import com.example.springbootdocker.bean.EmpBean;
import com.example.springbootdocker.server.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class EmpController {

    @Autowired
    private EmpService service;

    @RequestMapping("/")
    public String home1() {
        return "SpringbootDockerApplication success";
    }

    @RequestMapping("/home")
    public String home() {
        return "Hello Docker World.";
    }

    @RequestMapping(value = "/getEmpList", method = RequestMethod.GET)
    @ResponseBody
    public List<EmpBean> getEmpList(){
        log.info("EmpController getEmpList");
        return service.getEmpList();
    }

}
