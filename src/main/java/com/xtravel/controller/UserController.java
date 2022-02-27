package com.xtravel.controller;


import com.xtravel.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-11-22 20:14:11
 */
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @GetMapping("/aabb")
    public String geetUserId() {
        log.debug("geetUserId");
        return "0000";
    }

    /**
     * webflux测试
     */
    //@GetMapping("/{id}")
    //public Mono<User> geetUserId(@PathVariable int id) {
    //    return userService.getUserById(id);
    //}
    ////查询所有
    //@GetMapping
    //public Flux<User> getUsers() {
    //    return userService.getAllUser();
    //}
    ////添加
    //@PostMapping
    //public Mono<Void> saveUser(@RequestBody User user) {
    //    Mono<User> userMono = Mono.just(user);
    //    return userService.saveUserInfo(userMono);
    //}
}

