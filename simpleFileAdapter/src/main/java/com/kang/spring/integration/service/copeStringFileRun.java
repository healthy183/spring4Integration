package com.kang.spring.integration.service;

import org.springframework.beans.DirectFieldAccessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

import java.io.File;

/**
 * Created by Administrator on 2016/4/10.
 */
public class copeStringFileRun {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context   = new ClassPathXmlApplicationContext("copeStringFile.xml");
        try {
            File inDir = (File) new DirectFieldAccessor(context.getBean(FileReadingMessageSource.class)).getPropertyValue("directory");
            LiteralExpression expression = (LiteralExpression) new DirectFieldAccessor(context.getBean(FileWritingMessageHandler.class)).getPropertyValue("destinationDirectoryExpression");
            File outDir = new File(expression.getValue());
            System.out.println("Input directory is: " + inDir.getAbsolutePath());
            System.out.println("Output directory is: " + outDir.getAbsolutePath());
            System.out.println("===================================================");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            context.close();
        }
    }
}
