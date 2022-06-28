package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crush
 */
@RestController
@RequestMapping("/controller")
public class HollerController {

    @GetMapping("/getName")
    public String getName() {
        return "com.docker.controller";
    }

}
