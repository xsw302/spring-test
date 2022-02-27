package com.xtravel;

import com.xtravel.service.UserService;
import com.xtravel.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import javax.annotation.Priority;

/**
 * 启动程序
 *
 * @author ZZS
 */
@SpringBootApplication
//@EnableAspectJAutoProxy
@Slf4j
public class XtravelApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(XtravelApplicationTest.class, args);
    }
    //
    //@Bean("userService2222")
    ////@Qualifier("userService2222")
    //public UserService userService2(){
    //    UserServiceImpl userService = new UserServiceImpl();
    //    log.debug("注入的userService2:" + userService);
    //    return userService;
    //}
    //
    //@Bean
    ////@Qualifier("userService2222")
    //public UserService userService3(){
    //    UserServiceImpl userService = new UserServiceImpl();
    //    log.debug("注入的userService3:" + userService);
    //    return userService;
    //}

    /**
     * autowireCandidate默认为true，设置为false后，依赖注入查找bean时如果根据类型匹配到多个后会忽略autowireCandidate=false的bean
     */
    //@Bean(autowireCandidate = false)
    //public UserService userService4(){
    //    UserServiceImpl userService = new UserServiceImpl();
    //    log.debug("注入的userService4:" + userService);
    //    return userService;
    //}
}
