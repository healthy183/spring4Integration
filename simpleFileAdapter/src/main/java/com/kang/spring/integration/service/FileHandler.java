package com.kang.spring.integration.service;

import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @Title 类名
 * @Description 类描述
 * @Date 2016/2/24 16:02
 * @Author 梁健康
 * @Version 2.0
 */
@Service
public class FileHandler {

    public File handle(File input){
        System.out.println("Copying file:"+input.getAbsolutePath());
        return input;
    }
}
