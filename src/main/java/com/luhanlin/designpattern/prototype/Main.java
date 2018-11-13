package com.luhanlin.designpattern.prototype;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 5:39 PM
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        MessageBox box01 = new MessageBox('*');
        MessageBox box02 = new MessageBox('/');
        UnderlinePen pen = new UnderlinePen('~');

        manager.registerProduct("box01", box01);
        manager.registerProduct("box02", box02);
        manager.registerProduct("pen", pen);

        manager.getProduct("box01").use("hello box01");
        manager.getProduct("box02").use("hello box02");
        manager.getProduct("pen").use("hello pen");
    }
}
