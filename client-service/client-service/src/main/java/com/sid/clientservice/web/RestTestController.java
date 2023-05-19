package com.sid.clientservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class RestTestController {
    @Value("${global.param.p1}")
    private String p1;
    @Value("${global.param.p2}")
    private String p2;
    @Value("${client.params.x}")
    private String x;
    @Value("${client.params.y}")
    private String y;
    @GetMapping("/params")
    public String params(){
       String params=" p1  "+p1+" p2 "+p2+" x  "+x+" y  "+y;
        return params;
    }
}
