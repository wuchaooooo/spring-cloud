package com.wuchaooooo.study.springcloud.client1.frontend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wuchaooooo on 08/07/2017.
 */
public interface Client1Api {
    @RequestMapping("/client1")
    ResponseEntity<String> demo();

}
