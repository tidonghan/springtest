package com.rkhd.spring.springtest.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: td
 * @Description:
 * @Date: Created in 20:38 2018/2/4
 * @Version:
 * @Copyright: 2018 www.xiaoshouyi.com Inc. All rights reserved.
 */
@Aspect  //注解声明一个切面
@Component //让次切面成为spring容器管理的bean
public class LogAspect {
    //声明切点
    @Pointcut("@annotation(com.rkhd.spring.springtest.ch1.aop.Action)")
    public void annotationPointCut() {
    }

    //@After注解声明一个通知，请使用@pointCut定义的切点
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解拦截器 " + action.name());
    }


    @Before("execution(* com.rkhd.spring.springtest.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截，" + method.getName());
    }


}
