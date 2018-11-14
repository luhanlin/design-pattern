package com.luhanlin.designpattern.bridge;

/**
 * 类详细描述：抽象桥
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 12:09 PM
 */
public class Display {

    private DisplayImpl displayimpl;

    public Display(DisplayImpl displayimpl) {
        this.displayimpl = displayimpl;
    }

    // 将方法桥接进来
    public void open(){
        displayimpl.rawOPen();
    }
    public void print() {
        displayimpl.rawPrint();
    }
    public void close(){
        displayimpl.rawclose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
