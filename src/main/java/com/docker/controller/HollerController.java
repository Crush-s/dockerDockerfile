package com.docker.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crush
 */
@RestController
@RequestMapping("/controller")
public class HollerController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/getName")
    public String getName() {
        User user = userMapper.selectById(1);
        assert user != null;
        return user.toString();
    }

}
