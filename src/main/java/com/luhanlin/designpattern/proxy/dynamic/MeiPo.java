package com.luhanlin.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/4 3:48 下午
 */
public class MeiPo implements InvocationHandler {

    private Object person;


    public Object getInstance(Object person) {
        this.person = person;
        Class<?> clzz = this.person.getClass();
        return Proxy.newProxyInstance(clzz.getClassLoader(), clzz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("媒婆介入");
        Object result = method.invoke(person, args);
        System.out.println("成功...");
        return result;
    }
}
