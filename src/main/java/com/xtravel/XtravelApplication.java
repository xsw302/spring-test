package com.xtravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 启动程序
 *
 * @author ZZS
 */
@SpringBootApplication
//开启注解驱动的缓存管理
@EnableCaching
public class XtravelApplication {

    public static void main(String[] args) {
        SpringApplication.run(XtravelApplication.class, args);
    }

}
