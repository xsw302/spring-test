package com.xtravel.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
@Slf4j
public class AspectTest3 {
    @Before("execution(* com.xtravel.controller.*.*(..))")
    public void userBefore2(JoinPoint point){
        log.debug("前置通知-2");
    }

    @After("execution(* com.xtravel.controller.*.*(..))")
    public void userAfter2(JoinPoint point){
        log.debug("后置通知-2");
    }

    @Around("execution(* com.xtravel.controller.*.*(..))")
    public Object userAround2(ProceedingJoinPoint point) throws Throwable {
        log.debug("环绕前置通知-2");
        // 执行业务方法
        Object result = null;
        try {
            result = point.proceed();
            return result;
        } finally {
            log.debug("环绕后置通知-2");
        }
    }
}
