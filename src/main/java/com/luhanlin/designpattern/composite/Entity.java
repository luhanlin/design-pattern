package com.luhanlin.designpattern.composite;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 5:14 PM
 */
public abstract class Entity {

    public abstract String getName();

    public abstract int getSize();

    public abstract void printList(String directory);

    public void add(Entity entity) throws FileTreatmentException{
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
