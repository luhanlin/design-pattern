package com.luhanlin.designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 类详细描述：被观察着抽象类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/20 10:40 AM
 */
public abstract class NumberGenerator {

    private ArrayList<Observer> list = new ArrayList();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    // 调用观察着方法
    protected void notifyObserver(){
        Iterator<Observer> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().update(this);
        }
    }

    // 数字生成器自身需要被实现的抽象类
    public abstract int getNumber();
    public abstract void execute();
}
