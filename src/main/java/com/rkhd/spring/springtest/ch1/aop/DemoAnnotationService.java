package com.rkhd.spring.springtest.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @Author: td
 * @Description: 使用注解的被拦截类
 * @Date: Created in 18:52 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add 操作")
    public void add() {
    }
}
