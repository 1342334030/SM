package com.example.demo;

import com.example.demo.mappers.DeptMapper;
import com.example.demo.mappers.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class SmApplicationTests {

    @Autowired
    private EmpMapper empMapper;
    private DeptMapper deptMapper;
    @Test
    void contextLoads() {
        Map<String, String> emps = empMapper.findEmpAndMgr();
        for(String empName : emps.keySet())
            System.out.printf("<%s, %s>\n", empName, emps.get(empName));
    }


}
