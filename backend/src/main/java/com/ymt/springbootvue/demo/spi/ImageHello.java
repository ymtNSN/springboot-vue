package com.ymt.springbootvue.demo.spi;

/**
 * Created by @author yangmingtian on 2019/9/11
 */
public class ImageHello implements HelloSpi {
    @Override
    public void sayHello() {
        System.out.println("Image Hello");
    }
}
