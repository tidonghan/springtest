package com.rkhd.spring.springtest.ch1.javaconfig;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 18:40 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
public class UseFunctionService {
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
