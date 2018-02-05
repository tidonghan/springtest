package com.rkhd.spring.springtest.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 20:22 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Configuration
@ComponentScan("com.rkhd.spring.springtest.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
