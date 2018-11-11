package com.luhanlin.designpattern.template_method;

/**
 * 类详细描述：模版
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 12:51 PM
 */
public abstract class AbstractDisplay {

    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    // 表示不可被继承的方法
    public final void display(){
        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }

}
