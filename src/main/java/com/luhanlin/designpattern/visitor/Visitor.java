package com.luhanlin.designpattern.visitor;

/**
 * 类详细描述：访问抽象类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 9:24 AM
 */
public interface Visitor {

    void vistor(File file);

    void vistor(Directory directory);
}
