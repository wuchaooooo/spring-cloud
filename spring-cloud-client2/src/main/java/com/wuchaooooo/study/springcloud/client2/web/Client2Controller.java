package com.wuchaooooo.study.springcloud.client2.web;

import com.wuchaooooo.study.springcloud.client2.service.Client1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuchaooooo on 27/06/2017.
 */
@Controller
public class Client2Controller {
    @Value("${server.port}")
    String port;

    @Autowired
    private Client1Service client1Service;

    @RequestMapping(value = "/client")
    @ResponseBody
    public String index(@RequestParam String name) {
        return "hi " + name + "I'm from port:" + port;
    }

    @RequestMapping(value = "/client2")
    ResponseEntity<String> demo() {
        return client1Service.demo();
    }
}
