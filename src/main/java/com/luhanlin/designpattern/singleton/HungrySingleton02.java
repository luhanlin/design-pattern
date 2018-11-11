package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：基础饿汉式单例
 *   与{@link HungrySingleton} 基本一样
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:02 PM
 */
public class HungrySingleton02 {

    private static HungrySingleton02 demo = null;

    {
        demo = new HungrySingleton02();
    }

    private HungrySingleton02(){}

    public static HungrySingleton02 getInstance(){
        return demo;
    }

}
