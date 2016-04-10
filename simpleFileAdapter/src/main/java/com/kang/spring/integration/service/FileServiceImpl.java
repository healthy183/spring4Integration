package com.kang.spring.integration.service;

import com.kang.spring.integration.domain.Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/4/10.
 */
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private MessageChannel filesIn;

    @Override
    public Domain send() {
        Domain domain  = new Domain();
        //domain.setFileName("tom.txt");
        //filesIn.send(MessageBuilder.withPayload(domain).build());
        return domain;
    }
}
