package com.kang.spring.integration.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by Administrator on 2016/3/21.
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {
    private List<Drink> drinks;
}
