package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：静态内部类单例
 *   利用了classloder的机制来保证初始化instance时只有一个线程，虚拟机会保证一个类的类构造器<clinit>()在多线程环境中被正确的加锁、同步，
 *      如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的类构造器<clinit>()，其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:21 PM
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        public static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}
