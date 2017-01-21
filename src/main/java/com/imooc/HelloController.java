package com.imooc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wutongpeng on 2017/1/21.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
    }
}
