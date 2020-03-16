package com.soft.test;

import com.soft.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2020/2/13.
 */
public class SpringTest1 {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userServiceImpl = (UserService) applicationContext.getBean("userServiceImpl");
        System.out.println("测试");
        userServiceImpl.findAll();
    }
}
