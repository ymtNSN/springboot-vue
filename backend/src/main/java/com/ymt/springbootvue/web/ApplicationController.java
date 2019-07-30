package com.ymt.springbootvue.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author ymtNSN
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("/web")
public class ApplicationController {

    private Logger logger = Logger.getLogger(ApplicationController.class);

    @RequestMapping(value = "/log/{msg}", method = RequestMethod.GET)
    public void log(@PathVariable("msg") String msg) {
        logger.error(msg);
    }
}
