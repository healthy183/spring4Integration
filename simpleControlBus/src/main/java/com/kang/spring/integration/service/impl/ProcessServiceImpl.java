package com.kang.spring.integration.service.impl;

import com.kang.spring.integration.service.ProcessService;
import org.springframework.stereotype.Service;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/1/29 17:59
 * @Author 梁健康
 * @Version 2.0
 */
@Service
public class ProcessServiceImpl implements ProcessService {
    @Override
    public String mainProcess() {
        return "processing";
    }
}
