package com.example.springbootdocker.mapper;

import com.example.springbootdocker.bean.EmpBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpMapper {

    List<EmpBean> getEmpList();

}
