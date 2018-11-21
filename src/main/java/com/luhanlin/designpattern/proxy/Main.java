package com.luhanlin.designpattern.proxy;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 5:14 PM
 */
public class Main {

    public static void main(String[] args) {
        Pintable test = new PrinterProxy("test");
        System.out.println("现在的用户名为： " + test.getName());

        test.setName("bob");
        System.out.println("现在的用户名为： " + test.getName());

        test.print("hello bob");
    }
}
