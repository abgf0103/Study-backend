package com.example.daegulbackend.mapper;

import com.example.daegulbackend.model.TestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestVO> getTestList();
}
