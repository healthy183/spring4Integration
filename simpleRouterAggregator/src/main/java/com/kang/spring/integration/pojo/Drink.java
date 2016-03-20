package com.kang.spring.integration.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Administrator on 2016/3/21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Drink implements  java.io.Serializable {

    private Integer orderNumber;
    private DrinkType drinkType;
    private boolean iced;
    private int antall;


}
