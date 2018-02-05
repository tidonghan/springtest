package com.rkhd.spring.springtest.ch3.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.AsyncConfigurer;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 20:06 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            taskService.executeAsyncTask(i);
            taskService.executeAsynTaskPlus(i);
        }
        context.close();

    }
}
