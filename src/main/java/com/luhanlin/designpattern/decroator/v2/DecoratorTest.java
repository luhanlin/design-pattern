package com.luhanlin.designpattern.decroator.v2;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 9:42 上午
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Cake cake = new BaseCake();
        cake = new CakeAddEgg(cake);
        cake = new CakeAddHotDog(cake);
        cake = new CakeAddEgg(cake);

        System.out.println(cake.getMsg() + ", 花费：" + cake.consume() + "元");
    }
}
