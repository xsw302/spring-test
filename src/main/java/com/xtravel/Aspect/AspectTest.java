package com.xtravel.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AspectTest {
    //@Around("execution(* com.xtravel.service.*.*(..))")
    public Object userAround(ProceedingJoinPoint point) throws Throwable {
        log.debug("环绕前置通知");
        // 执行业务方法
        Object result = null;
        try {
            result = point.proceed();
            return result;
        } finally {
            log.debug("环绕后置通知");
        }
    }

    @Before("execution(* com.xtravel.service.*.*(..))")
    public void userBefore(JoinPoint point){
        log.debug("前置通知");
    }

    @AfterReturning("execution(* com.xtravel.service.*.*(..))")
    public void userAfterReturning(JoinPoint point){
        log.debug("return后通知");
    }

    @AfterThrowing("execution(* com.xtravel.service.*.*(..))")
    public void userAfterThrowing(JoinPoint point){
        log.debug("Throw后通知");
    }

    @After("execution(* com.xtravel.service.*.*(..))")
    public void userAfter(JoinPoint point){
        log.debug("后置通知");
    }
}
