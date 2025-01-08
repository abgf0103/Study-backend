package com.example.daegulbackend.service;

import com.example.daegulbackend.mapper.TestMapper;
import com.example.daegulbackend.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final TestMapper testMapper;

    @Autowired
    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public List<TestVO> getTestList() {
        return testMapper.getTestList();
    }
}
