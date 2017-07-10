package com.wuchaooooo.study.springcloud.client1.frontend.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuchaooooo on 08/07/2017.
 */
@RestController
@RefreshScope
public class Client1ApiController implements Client1Api{
    @Value("${user.name}")
    private String name;

    @Override
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>("这是client1的前端接口", HttpStatus.OK);

    }

}
