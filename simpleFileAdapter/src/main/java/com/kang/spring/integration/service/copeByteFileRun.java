package com.kang.spring.integration.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;

/**
 * Created by Administrator on 2016/4/10.
 */
public class copeByteFileRun {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context   = new ClassPathXmlApplicationContext("copeByteFile.xml");
        try {

              /*PollableChannel pollableChannel = (PollableChannel)context.getBean("filesIn");
                Message<Byte[]> message = (Message<Byte[]>) pollableChannel.receive(1000);*/
            FileService fileService = (FileService) context.getBean("fileServiceImpl");
            fileService.send();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //不关闭容器,则一直轮询
            //context.close();
        }



    }
}
