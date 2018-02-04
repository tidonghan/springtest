package com.rkhd.spring.springtest.ch2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 21:07 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1 与 s2 是否相等：" + (s1 == s2));
        System.out.println("p1 与 p2 是否相等：" + (p1 == p2));

    }
}
