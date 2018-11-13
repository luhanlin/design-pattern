package com.luhanlin.designpattern.builder;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 11:50 PM
 */
public class Main {

    public static void main(String[] args) {
        TxtBuilder txtBuilder = new TxtBuilder();

        Director director = new Director(txtBuilder);

        director.construct();

        System.out.println(txtBuilder.getResult());
    }
}
