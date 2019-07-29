package com.ymt.springbootvue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description TODO
 * @Author yangmingtian
 * @Date 2019/7/11
 */
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
