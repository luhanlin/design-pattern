package com.luhanlin.designpattern.prototype;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 6:06 PM
 */
public abstract class CloneCommon implements Product {

    @Override
    public Product createCase() {
        Product clone = null;
        try {
            clone = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
