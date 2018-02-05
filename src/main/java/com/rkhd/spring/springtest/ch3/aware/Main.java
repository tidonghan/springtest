package com.rkhd.spring.springtest.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 8:14 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outPutResult();
        context.close();
    }
}
