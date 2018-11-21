package com.luhanlin.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 类详细描述：保存状态的类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 9:26 AM
 */
public class Memento {

    private int money;
    private ArrayList fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney(){
        return money;
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List getFruits(){
        return (List) fruits.clone();
    }
}
