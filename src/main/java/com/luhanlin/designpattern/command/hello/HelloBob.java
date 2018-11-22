package com.luhanlin.designpattern.command.hello;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/22 9:34 AM
 */
public class HelloBob implements Helloable {
    @Override
    public void hello() {
        System.out.println("Bob");
    }
}
