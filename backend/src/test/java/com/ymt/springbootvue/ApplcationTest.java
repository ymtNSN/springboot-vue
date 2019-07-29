package com.ymt.springbootvue;

import com.ymt.springbootvue.domain.server.QuarkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Description TODO
 * @Author ymtNSN
 * @Date 2019/7/29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplcationTest {

    @Autowired
    private QuarkService quarkService;

    @Test
    public void test() {
        quarkService.createQuarkLable();
//        quarkService.createQuarkRole();
    }
}
