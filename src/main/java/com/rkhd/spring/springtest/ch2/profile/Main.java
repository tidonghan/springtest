package com.rkhd.spring.springtest.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:34 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将活动的profile 设置为dev
        applicationContext.getEnvironment().setActiveProfiles("dev");
        //后置注册Bean配置类，不然会报Bean未定义的错误
        applicationContext.register(ProfileConfig.class);
        //刷新容器
        applicationContext.refresh();

        DemoBean demoBean = applicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        applicationContext.close();

    }

}
