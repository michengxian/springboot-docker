package com.example.springbootdocker.server;

import com.example.springbootdocker.bean.EmpBean;
import com.example.springbootdocker.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpMapper mapper;


    public List<EmpBean> getEmpList(){
        return mapper.getEmpList();
    }

}
