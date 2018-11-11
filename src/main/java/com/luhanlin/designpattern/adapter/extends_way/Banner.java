package com.luhanlin.designpattern.adapter.extends_way;

/**
 * 类详细描述：实际的类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:40 AM
 */
public class Banner {

    private String name;

    public Banner(String name) {
        this.name = name;
    }

    public void showWithWeak(){
        System.out.println("(" + name + ")");
    }

    public void showWithStrong(){
        System.out.println("*" + name + "*");
    }
}
