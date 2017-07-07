package com.wuchaooooo.study.springcloud.client1.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

/**
 * Created by wuchaooooo on 27/06/2017.
 */
@Controller
@RefreshScope
public class InnerClientApiController implements InnerClient1Api{
    @Value("${user.name}")
    private String name;

    @Override
    public ResponseEntity<String> demo() {

        return new ResponseEntity<>("这是第1个实现类, 用户的姓名是" + name, HttpStatus.OK);
    }
}
