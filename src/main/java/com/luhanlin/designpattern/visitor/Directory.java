package com.luhanlin.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 5:32 PM
 */
public class Directory extends Entity {
    private String name;

    private ArrayList list = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Entity entity = (Entity) iterator.next();
            size += entity.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix +"/" + this);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Entity entity = (Entity) iterator.next();
            entity.printList(prefix +"/" + name);
        }
    }

    @Override
    public Iterator getIterable() {
        return list.iterator();
    }

    @Override
    public void add(Entity entity){
        list.add(entity);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.vistor(this);
    }
}
