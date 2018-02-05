package com.rkhd.spring.springtest.ch3.fortest;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 20:41 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class TestBean {

    private String content;

    public TestBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
