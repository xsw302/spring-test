package com.xtravel.service;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class UserServiceProxy implements InvocationHandler {
    private Object obj;

    public UserServiceProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {//方法之前
        log.debug("方法之前执行...." + method.getName() + " :传递的参数..." + Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        log.debug("方法之后执行...." + obj);
        return res;
    }
}
