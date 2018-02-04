package com.rkhd.spring.springtest.ch1.annotation;

import com.rkhd.spring.springtest.ch1.annotation.config.DiConfig;
import com.rkhd.spring.springtest.ch1.annotation.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 18:27 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext 作为Spring容器，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("  td"));
        context.close();
    }
}
