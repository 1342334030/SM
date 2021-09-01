package com.example.demo.mappers;

import com.example.demo.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;
@Mapper
public interface DeptMapper {
    List<Dept> findAllDept();

}
