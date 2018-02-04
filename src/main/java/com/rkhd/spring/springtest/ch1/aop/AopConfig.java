package com.rkhd.spring.springtest.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 20:48 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Configuration
@ComponentScan("com.rkhd.spring.springtest.ch1.aop")
@EnableAspectJAutoProxy //开启spring 对AspectJ代理的支持
public class AopConfig {
}
