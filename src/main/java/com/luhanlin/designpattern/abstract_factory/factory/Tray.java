package com.luhanlin.designpattern.abstract_factory.factory;

import java.util.ArrayList;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 9:22 AM
 */
public abstract class Tray extends Item {

    protected ArrayList<Item> items = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        items.add(item);
    }
}
