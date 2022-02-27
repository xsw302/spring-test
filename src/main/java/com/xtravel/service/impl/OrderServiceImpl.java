package com.xtravel.service.impl;

import com.xtravel.service.OrderService;
import com.xtravel.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-11-22 20:14:22
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    public UserService userService;
}


















