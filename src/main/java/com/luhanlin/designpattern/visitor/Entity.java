package com.luhanlin.designpattern.visitor;

import java.util.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 9:18 AM
 */
public abstract class Entity implements Element{

    public abstract String getName();

    public abstract int getSize();

    public abstract void printList(String directory);

    public Iterator getIterable(){
        throw new FileTreatmentException();
    }

    public void add(Entity entity) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void print(){
        printList("");
    }

    // 模板模式
    public String toString(){
        return getName() + " ( " +getSize() +" ) ";
    }
}
