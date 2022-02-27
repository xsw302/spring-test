package com.xtravel.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取Spring的ApplicationContext工具
 *
 * @author lwd
 * @author Ziv
 */
@Component
public class SpringContext implements ApplicationContextAware {

    protected static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static ApplicationContext getContext() {
        return context;
    }

    public static Object getBean(String name) {
        return context.getBean(name);
    }

    public static <T> T getBean(Class<T> requiredType) {
        return context.getBean(requiredType);
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return context.getBean(name, requiredType);
    }

    /**
     * 获取当前环境
     *
     * @return 当前环境列表
     */
    public static String[] getActiveProfiles() {
        return context.getEnvironment().getActiveProfiles();
    }

    /**
     * 获取当前环境（最后一个。会在其它地方当作参数使用）
     *
     * @return 当前环境列表最后一个
     */
    public static String getActiveProfile() {
        String[] profiles = context.getEnvironment().getActiveProfiles();
        return profiles[profiles.length - 1];
    }
}
