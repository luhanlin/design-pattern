package com.luhanlin.designpattern.abstract_factory.factory;

import lombok.AllArgsConstructor;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 9:04 AM
 */
@AllArgsConstructor
public abstract class Item {

    protected String caption;

    public abstract String makeHtml();

}
