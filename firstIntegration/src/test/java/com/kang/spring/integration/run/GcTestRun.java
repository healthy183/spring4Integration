package com.kang.spring.integration.run;

/**
 * Created by Administrator on 2016/2/14.
 */
public class GcTestRun {

    public static void main(String[] args) {

        for(int i=0;i<7000000;i++){
            System.out.println("test");
            if(i/7000 == 1){
                    System.gc();
            }
        }


    }
}
