package com.xtravel.service;

import com.xtravel.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2021-11-22 20:14:22
 */
public interface UserService {
    ////根据 id 查询用户
    //Mono<User> getUserById(int id);
    //
    ////查询所有用户
    //Flux<User> getAllUser();
    //
    ////添加用户
    //Mono<Void> saveUserInfo(Mono<User> user);

    //根据 id 查询
    User testTransaction();

    //根据 id 查询用户
    User getUserById(int id);

    //查询所有用户
    Collection<User> getAllUser();

    //添加用户
    void saveUserInfo(User user);
}

