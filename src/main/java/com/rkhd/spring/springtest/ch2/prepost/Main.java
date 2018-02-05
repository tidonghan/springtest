package com.rkhd.spring.springtest.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:28 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanInitService beanInitService = context.getBean(BeanInitService.class);
        context.close();
    }
}
