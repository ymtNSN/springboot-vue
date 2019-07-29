package com.ymt.springbootvue.utility;

import com.ymt.springbootvue.domain.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @Description TODO
 * @Author ymtNSN
 * @Date 2019/7/17
 */
public class Demo {
    public static void main(String[] args) {
        StringUtils.isBlank("{\"name\":null}");
        System.out.println("{\"name\":null}");
        System.out.println(NumberUtils.isDigits("13"));
        User user = new User();
        user.setId(0);
        user.setName("");
        System.out.println(user);


        if (1 == 1) {

        } else {

        }
    }
}
