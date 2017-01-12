package com.cloud.client.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dzg.
 * @since 17/1/11.
 */
@RestController
@RefreshScope
public class HelloWorldController {

    @Value("${hello.world.name}")
    private String name;

    @RequestMapping("/")
    public String index() {
        return name;
    }
}
