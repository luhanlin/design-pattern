package com.luhanlin.designpattern.adapter.extends_way;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:46 AM
 */
public class Main {

    public static void main(String[] args) {
        PrintBannerAdapter hello = new PrintBannerAdapter("hello");

        hello.printWeak();
        hello.printStrong();

    }
}
