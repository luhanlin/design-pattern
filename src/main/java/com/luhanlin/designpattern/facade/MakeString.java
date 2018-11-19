package com.luhanlin.designpattern.facade;

import java.time.LocalDateTime;

/**
 * 类详细描述：需要被组合使用的类1
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/19 9:55 PM
 */
public class MakeString {

    public static String getString(){
        return LocalDateTime.now().toString();
    }
}
