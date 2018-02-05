package com.rkhd.spring.springtest.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:53 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();

    }

}
