package com.luhanlin.designpattern.singleton;

import java.net.Socket;

/**
 * 类详细描述：双重校验锁
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:41 PM
 */
public final class DoubleLockSingleton {

    // 不使用volatile 可能发生指令重排导致socket没有被初始化完毕报空指针异常
    private static volatile DoubleLockSingleton singleton;

    private Socket socket;

    private DoubleLockSingleton(){

        // 此处阻止通过反射实例化实例
        if (singleton != null) {
            throw new IllegalStateException("Already initialized.");
        }
        this.socket = new Socket();
    }

    public static DoubleLockSingleton getInstance(){

        // 避免每次进入都需要进入同步代码块，提高效率
        if (singleton == null){
            synchronized(DoubleLockSingleton.class){
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }

}
