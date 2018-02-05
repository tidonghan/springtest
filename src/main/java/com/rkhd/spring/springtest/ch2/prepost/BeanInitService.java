package com.rkhd.spring.springtest.ch2.prepost;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:23 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class BeanInitService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanInitService() {
        super();
        System.out.println("初始化构造函数-BeanInitService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
