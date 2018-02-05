package com.rkhd.spring.springtest.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:32 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }
}
