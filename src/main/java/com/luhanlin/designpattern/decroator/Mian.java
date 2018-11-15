package com.luhanlin.designpattern.decroator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 12:00 AM
 */
public class Mian {

    public static void main(String[] args) {
        Display string = new StringDisplay("hello, world");
        Display fullBorder = new FullBorder(string);

        string.printContent();
        fullBorder.printContent();

        Display border_decorator = new FullBorder(new FullBorder(new StringDisplay("Border decorator")));
        border_decorator.printContent();
    }
}
