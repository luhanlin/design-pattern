package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：双重校验锁
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:41 PM
 */
public class DoubleLockSingleton {

    private static volatile DoubleLockSingleton singleton;

    private DoubleLockSingleton(){}

    public static DoubleLockSingleton getInstance(){
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
