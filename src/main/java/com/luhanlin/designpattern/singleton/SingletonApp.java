package com.luhanlin.designpattern.singleton;

import java.util.HashMap;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:04 PM
 */
public class SingletonApp {

    public static void main(String[] args) {
        System.out.println("start");

        // 测试饿汉式01
//        HungrySingleton demo01 = HungrySingleton.getInstance();
//        HungrySingleton demo02 = HungrySingleton.getInstance();

        // 测试饿汉式02
//        HungrySingleton02 demo01 = HungrySingleton02.getInstance();
//        HungrySingleton02 demo02 = HungrySingleton02.getInstance();

        // 测试线程不安全的懒汉式
        LazyLoadingUnSafety demo01 = LazyLoadingUnSafety.getInstance();
        LazyLoadingUnSafety demo02 = LazyLoadingUnSafety.getInstance();

        // 测试线程安全的懒汉式
//        LazyLoadingSafe demo01 = LazyLoadingSafe.getInstance();
//        LazyLoadingSafe demo02 = LazyLoadingSafe.getInstance();

        // 测试内部类单例
//        InnerClassSingleton demo01 = InnerClassSingleton.getInstance();
//        InnerClassSingleton demo02 = InnerClassSingleton.getInstance();

        // 测试枚举单例
//        EnumSingleton demo01 = EnumSingleton.getInstance();
//        EnumSingleton demo02 = EnumSingleton.getInstance();
//
//        System.out.println(demo01.getTickets());
//        System.out.println(demo02.getTickets());

        // 测试双重校验单例
//        DoubleLockSingleton demo01 = DoubleLockSingleton.getInstance();
//        DoubleLockSingleton demo02 = DoubleLockSingleton.getInstance();

        if (demo01 == demo02){
            System.out.println("实例相同");
        } else {
            System.out.println("实例不相同");
        }

        System.out.println("end");
    }
}
