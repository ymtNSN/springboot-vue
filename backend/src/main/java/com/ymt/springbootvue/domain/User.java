package com.ymt.springbootvue.domain;

import lombok.Data;

/**
 * @Description TODO
 * @Author ymtNSN
 * @Date 2019/7/17
 */
@Data
public class User {
    private int id;
    private String name;

    /**
     * age : 4
     */
    private int age;
}
