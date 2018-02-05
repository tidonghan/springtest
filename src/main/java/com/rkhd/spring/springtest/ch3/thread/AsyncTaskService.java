package com.rkhd.spring.springtest.ch3.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 20:00 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Service
public class AsyncTaskService {

    @Async  //通过@Async注解表明该方法是个异步方法，如果注解在类级别，则表明该类所有的方法都是异步的，而这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsynTaskPlus(Integer i) {
        System.out.println("执行异步任务+1 :" + (i + 1));
    }
}
