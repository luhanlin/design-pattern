package com.luhanlin.designpattern.decroator.v2;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 9:22 上午
 */
public class BaseCake extends Cake{

    @Override
    public String getMsg() {
        return "一块蛋糕";
    }

    @Override
    public Integer consume() {
        return 5;
    }
}
