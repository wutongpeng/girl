package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wutongpeng on 2017/1/21.
 */
@RestController//等于@ResponseBody+@Controller
@RequestMapping(value = "/girl")
public class HelloController {

    /*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;*/

    @Autowired
    private GirlProperties girlProperties;

    //1)@PathVariable 获取url中的数据  @PathVariable("id")
    // value = "/hello/{id}"  url: .../hello/23
    // value = "/{id}/hello"  url: .../23/hello
    //@RequestParam 获取请求参数的值 @RequestParam("id") ||@RequestParam(value = "id",required = false,defaultValue = "0")
    // value = "/hello"  url: .../hello?id=111

    //@GetMapping(value = "/hello")组合注解
    //@PutMapping(value = "/hello")
    @RequestMapping(value = {"/hello","/hi"} ,method = RequestMethod.GET)
    public String say(){
        return girlProperties.toString();
    }
}
