package com.wuchaooooo.study.springcloud.client2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wuchaooooo on 27/06/2017.
 */
@Component
@FeignClient("spring-cloud-client1")
public interface Client1Service {
    @RequestMapping(value = "/client1")
    ResponseEntity<String> demo();
}
