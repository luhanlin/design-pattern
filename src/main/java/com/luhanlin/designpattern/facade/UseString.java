package com.luhanlin.designpattern.facade;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/19 9:57 PM
 */
public class UseString {

    private String string;

    public UseString(String string) {
        this.string = string;
    }

    public void useString(){
        System.out.println("输出输入的结果：" + string);
    }
}
