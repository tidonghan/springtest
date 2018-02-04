package com.rkhd.spring.springtest.ch1.annotation.service;

import org.springframework.stereotype.Service;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 18:19 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "Hello" + word + " !";
    }
}
