package com.luhanlin.designpattern.proxy.dynamic;

/**
 * 类详细描述：JDK 动态代理测试
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/4 4:01 下午
 */
public class Test {

    public static void main(String[] args) {
        MeiPo meiPo = new MeiPo();
        Girls girls = new Girls();
        Person proxy = (Person)meiPo.getInstance(girls);

        proxy.findLove();
    }
}
