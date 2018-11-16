package com.luhanlin.designpattern.visitor;

import java.util.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 9:27 AM
 */
public class ListVisitor implements Visitor {

    private String currentdir = "";

    @Override
    public void vistor(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void vistor(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String saveDir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator iterable = directory.getIterable();
        while (iterable.hasNext()){
            Entity entity = (Entity) iterable.next();
            entity.accept(this);
        }
        currentdir = saveDir;
    }
}
