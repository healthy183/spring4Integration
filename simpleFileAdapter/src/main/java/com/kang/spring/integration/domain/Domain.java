package com.kang.spring.integration.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Administrator on 2016/4/10.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Domain implements  java.io.Serializable {

    private Integer id;
    private String  fileName;

    }
