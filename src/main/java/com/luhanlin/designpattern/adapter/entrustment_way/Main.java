package com.luhanlin.designpattern.adapter.entrustment_way;

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
        // 此处使用多态的方式
        Print print = new PrintBannerAdapter("hello");

        print.printWeak();
        print.printStrong();

    }
}
