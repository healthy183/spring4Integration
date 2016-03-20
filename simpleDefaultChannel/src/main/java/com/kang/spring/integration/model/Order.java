package com.kang.spring.integration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by Administrator on 2016/3/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements  java.io.Serializable {

    private int id;
    private boolean billed;
    private boolean invUpdated;
    private boolean emailSent;

    public Order(int id){
        this.id= id;
    }
}
