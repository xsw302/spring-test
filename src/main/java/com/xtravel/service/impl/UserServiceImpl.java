package com.xtravel.service.impl;

import com.xtravel.entity.User;
import com.xtravel.service.OrderService;
import com.xtravel.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.*;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-11-22 20:14:22
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    public OrderService orderService;

    //public UserServiceImpl(OrderService orderServices){
    //    //this.orderService = orderService;
    //    log.debug("11111");
    //}

    /*public UserServiceImpl(OrderService orderService, String aa){
        log.debug("20000");
    }*/

    //public UserServiceImpl(){
    //    log.debug("注入的UserService:" + this);
    //}

    //创建 map 集合存储数据
    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User(1,"lucy1", "nan", new Date(), "东莞长安", "123"));
        this.users.put(2, new User(2,"lucy2", "nan", new Date(), "东莞长安", "123"));
        this.users.put(3, new User(3,"lucy3", "nan", new Date(), "东莞长安", "123"));
    }

    @Override
    public User testTransaction() {
        return new User();
    }

    //根据 id 查询
    @Override
    public User getUserById(int id) {
        log.debug("方法调用");
        //int i = 10/0;
        return this.users.get(id);
    }

    //查询多个用户
    @Override
    public Collection<User> getAllUser() {
        return this.users.values();
    }

    //添加用户
    @Override
    public void saveUserInfo(User user) {
        int id = users.size() + 1;
        user.setId(id);
        users.put(id, user);
    }

    ////根据 id 查询
    //@Override
    //public Mono<User> getUserById(int id) {
    //    return Mono.justOrEmpty(this.users.get(id));
    //}
    //
    ////查询多个用户
    //@Override
    //public Flux<User> getAllUser() {
    //    return Flux.fromIterable(this.users.values());
    //}
    //
    ////添加用户
    //@Override
    //public Mono<Void> saveUserInfo(Mono<User> userMono) {
    //    return userMono.doOnNext(person -> {
    //        //向 map 集合里面放值
    //        int id = users.size() + 1;
    //        person.setId(id);
    //        users.put(id, person);
    //    }).thenEmpty(Mono.empty());
    //}
}


















