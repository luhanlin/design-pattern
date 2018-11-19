package com.luhanlin.designpattern.facade;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/19 9:59 PM
 */
public class Group {

    public static void group(){
        String string = MakeString.getString();

        UseString useString = new UseString(string);

        useString.useString();
    }
}
