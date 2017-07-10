package com.wuchaooooo.study.springcloud.client2.hystrix;

import com.wuchaooooo.study.springcloud.client2.frontend.service.Client1Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * Created by wuchaooooo on 07/07/2017.
 */
@Component
public class Client1ServiceHystrix implements Client1Service{
    @Override
    public ResponseEntity<String> demo() {
        return new ResponseEntity<>("client1无法调用， 使用Hystrix降级", HttpStatus.OK);
    }
}
