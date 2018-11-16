package com.luhanlin.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 10:22 AM
 */
public class FileFoundVisitor implements Visitor {

    private String fileSuffix; // 文件后缀
    private ArrayList list = new ArrayList();

    public FileFoundVisitor(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public Iterator getIterator(){
        return list.iterator();
    }

    @Override
    public void vistor(File file) {
        if (file.getName().contains(fileSuffix)){
            list.add(file);
        }
    }

    @Override
    public void vistor(Directory directory) {
        Iterator iterable = directory.getIterable();
        while (iterable.hasNext()){
            Entity next = (Entity) iterable.next();
            next.accept(this);
        }
    }
}
