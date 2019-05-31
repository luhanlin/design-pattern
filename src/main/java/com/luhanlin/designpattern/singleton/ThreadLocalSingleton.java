package com.luhanlin.designpattern.singleton;

/**
 * @description: Threadlocal 实现的单例模式 以空间换取时间的方式，为每一个线程提供了一根单独的变量
 *      严格来说 不应该属于单例模式
 * @author: Mr.Lu
 * @create: 2019-05-31 11:38
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> local = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){
    }

    public static ThreadLocalSingleton getInstance(){
        return local.get();
    }
}
