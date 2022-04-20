package com.cj.ssm.mapper;

import com.cj.ssm.entity.Dept;
import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Dept record);

    Dept selectByPrimaryKey(Integer deptId);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);
}