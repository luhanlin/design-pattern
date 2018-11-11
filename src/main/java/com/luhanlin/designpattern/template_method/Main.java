package com.luhanlin.designpattern.template_method;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 2:28 PM
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay stringDisplay01 = new StringDisplay("hello");
        AbstractDisplay stringDisplay02 = new StringDisplay("你好");

        AbstractDisplay charDisplay = new CharDisplay("a");

        charDisplay.display();

        stringDisplay01.display();
        stringDisplay02.display();
    }
}
