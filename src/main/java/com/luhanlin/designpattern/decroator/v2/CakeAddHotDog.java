package com.luhanlin.designpattern.decroator.v2;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 9:41 上午
 */
public class CakeAddHotDog extends CakeDecorator{

    public CakeAddHotDog(Cake cake) {
        super(cake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 一根热狗";
    }

    @Override
    protected Integer consume() {
        return super.consume() + 2;
    }
}
