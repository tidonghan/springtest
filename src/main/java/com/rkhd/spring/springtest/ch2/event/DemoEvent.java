package com.rkhd.spring.springtest.ch2.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 7:45 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = -8824025740222979282L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
