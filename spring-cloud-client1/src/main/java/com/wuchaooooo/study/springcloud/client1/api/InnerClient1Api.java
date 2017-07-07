package com.wuchaooooo.study.springcloud.client1.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wuchaooooo on 27/06/2017.
 */
public interface InnerClient1Api {
    @RequestMapping("/client1")
    ResponseEntity<String> demo();
}
