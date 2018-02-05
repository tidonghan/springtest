package com.rkhd.spring.springtest.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:48 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-demoListener）接受到了 bean-demoPublisher 发布的消息：" + msg);
    }
}
