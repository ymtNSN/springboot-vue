package com.ymt.springbootvue.demo.spi;

/**
 * Created by @author yangmingtian on 2019/9/11
 */
public class TextHello implements HelloSpi {
    @Override
    public void sayHello() {
        System.out.println("Text Hello");
    }
}
