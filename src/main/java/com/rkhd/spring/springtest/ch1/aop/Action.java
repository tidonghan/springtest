package com.rkhd.spring.springtest.ch1.aop;

import java.lang.annotation.*;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 18:49 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
