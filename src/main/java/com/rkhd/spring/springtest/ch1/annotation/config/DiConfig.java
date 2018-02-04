package com.rkhd.spring.springtest.ch1.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: td
 * @Description: Configuration 声明当前类时一个配置类
 * ComponentScan 自动扫描包名下所有使用@Service，@Component、@Repository和@Controller，并注册为bean
 * @Date: Created in 18:23 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Configuration
@ComponentScan("com.rkhd.spring.springtest")
public class DiConfig {
}
