package com.luhanlin.designpattern.bridge;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 12:36 PM
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayimpl) {
        super(displayimpl);
    }

    public void multiDisplay(int count){
        open();
        for (int i = 0; i < count; i++) {
            print();
        }
        close();
    }
}
