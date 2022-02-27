package com.xtravel;

import com.xtravel.service.OrderService;
import com.xtravel.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XtravelApplicationTest.class)
@Slf4j
public class Test1 {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private OrderService orderService;

    /**
     * 测试切面
     */
    @Test
    public void testAspect() {
        log.debug("方法调用前");
        userService.getUserById(1);
        log.debug("方法调用后");
        System.out.println(userService.getClass());
    }

    /**
     * 测试依赖注入，多个bean时的匹配规则
     */
    @Test
    public void t2() {
        //log.debug("注入的userService-真正：" + userService);
        log.debug("注入的userService-真正：");
    }

    //@Test
    //public void t1(){
    //    userService.get();
    //    //userService = new UserServiceImpl();
    //    OrderService orderService2 = userService.orderService;
    //    OrderServiceImpl orderService3 = new OrderServiceImpl();
    //    userService.orderService = orderService3;
    //    UserService bean = SpringContext.getBean(UserService.class);
    //    log.debug("11110000");
    //}

    /**
     * JDK动态代理
     */
    //@Test
    //public void testAspect() {
    //    String s = userService.get();
    //    log.debug("..............");
    //    //userService.get(10000);
    //}

    /**
     * JDK动态代理
     */
    //@Test
    //public void testJDKProxy() {
    //    //创建接口实现类代理对象
    //    Class[] interfaces = {UserService.class};
    //    UserService user =
    //            (UserService) Proxy.newProxyInstance(AopAutoConfiguration.JdkDynamicAutoProxyConfiguration.class.getClassLoader(),
    //                    interfaces, new UserServiceProxy(userService));
    //    user.get();
    //}
}

























