package com.ymt.springbootvue.demo.spi;

import java.util.ServiceLoader;

/**
 * Created by @author yangmingtian on 2019/9/11
 */
public class TestSpi {
    public static void main(String[] args) {
        ServiceLoader<HelloSpi> serviceLoader = ServiceLoader.load(HelloSpi.class);
        for (HelloSpi helloSpi:serviceLoader){
            helloSpi.sayHello();
        }
    }
}
