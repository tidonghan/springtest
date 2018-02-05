package com.rkhd.spring.springtest.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:25 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Configuration
@ComponentScan("com.rkhd.spring.springtest.ch2.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanInitService beanInitService() {
        return new BeanInitService();
    }
}
