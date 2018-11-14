package com.luhanlin.designpattern.bridge;

/**
 * 类详细描述：需要被桥接的抽象类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 12:10 PM
 */
public abstract class DisplayImpl {

    public abstract void rawOPen();
    public abstract void rawPrint();
    public abstract void rawclose();
}
