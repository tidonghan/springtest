package com.rkhd.spring.springtest.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 8:09 2018/2/5
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outPutResult() {
        System.out.println("Bean 的名称为：" + beanName);

        Resource resource = loader.getResource("classpath:com/rkhd/spring/springtest/ch3/aware/test.txt");

        try {
            System.out.println("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
