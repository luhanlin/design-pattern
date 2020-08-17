package com.luhanlin.designpattern.decroator.v2;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 9:24 上午
 */
public abstract class CakeDecorator extends Cake{

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    protected String getMsg() {
        return cake.getMsg();
    }

    @Override
    protected Integer consume() {
        return cake.consume();
    }

}
