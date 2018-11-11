package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：基础饿汉式单例
 *   这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，
 *      这时候初始化instance显然没有达到lazy loading的效果
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:02 PM
 */
public class HungrySingleton {

    private static HungrySingleton demo = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return demo;
    }

}
