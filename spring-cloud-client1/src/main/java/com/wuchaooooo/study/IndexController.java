package com.wuchaooooo.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuchaooooo on 27/06/2017.
 */
@Controller
public class IndexController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/client")
    @ResponseBody
    public String index(@RequestParam String name) {
        return "hi " + name + "I'm from port:" + port;
    }
}
