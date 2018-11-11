package com.luhanlin.designpattern.factory_method;

import com.luhanlin.designpattern.factory_method.framework.Factory;
import com.luhanlin.designpattern.factory_method.framework.Product;
import com.luhanlin.designpattern.factory_method.idcard.IdCardFactory;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 5:40 PM
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();

        Product tom = factory.create("Tom", "No.1");
        Product ben = factory.create("Ben", "No.2");
        Product john = factory.create("John", "No.3");

        tom.use();
        ben.use();
        john.use();
    }
}
