package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：枚举形式单例，解决多线程和能防止反序列化重新创建新的对象的单例模式
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:32 PM
 */
public class EnumSingleton {

    private int tickets = 1000;

    private EnumSingleton(){}

    public static EnumSingleton getInstance(){
        return Singleton.SINGLETON.getInstance();
    }

    public int getTickets(){
        return tickets++;
    }

    enum Singleton {

        SINGLETON;

        private EnumSingleton enumSingleton;

        Singleton() {
            this.enumSingleton = new EnumSingleton();
        }

        private EnumSingleton getInstance(){
            return this.enumSingleton;
        }
    }

}
