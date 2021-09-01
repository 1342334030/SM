package com.example.demo.mappers;

import com.example.demo.domain.Emp;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper

public interface EmpMapper {
    List<Emp> findAll();
    List<Emp> findEmpnoByDeptno(Integer deptno);
    int upDateSal(Integer empno,Double sal);
    @MapKey("ename")
    Map<String, String> findEmpAndMgr();
}
