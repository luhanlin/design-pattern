package com.luhanlin.designpattern.prototype;

/**
 * 类详细描述：原型实体创建接口
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 5:23 PM
 */
public interface Product extends Cloneable{

    void use(String s);

    Product createCase();
}
