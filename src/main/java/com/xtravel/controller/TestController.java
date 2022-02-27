package com.xtravel.controller;

import com.xtravel.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController{

    @GetMapping("{id2}")
    public User selectByPageEnname(String username, @PathVariable Integer id2, User user, Map map) {
        log.debug("00000000000");
        return user;
    }

    @GetMapping("/3/{id3}")
    public Integer selectByPageEnname3(@PathVariable Integer id3) {
        return id3;
    }
}
