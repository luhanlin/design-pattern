package com.luhanlin.designpattern.decroator;

/**
 * 类详细描述：需要被装饰的抽象类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:24 PM
 */
public abstract class Display {

    public abstract int getColumes();

    public abstract int getRows();

    public abstract String getContents(int row);

    // 展示
    public final void printContent(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getContents(i));
        }
    }
}
