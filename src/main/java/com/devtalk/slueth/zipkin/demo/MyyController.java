package com.devtalk.slueth.zipkin.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyyController {
    private final Logger log = LoggerFactory.getLogger(MyyController.class);

    @GetMapping("/hello")
    public String getHomeText() {
        log.info("Calling home service......");
        return "Welcome Home!!!";
    }
}
