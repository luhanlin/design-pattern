package com.luhanlin.designpattern.abstract_factory.list_factory;

import com.luhanlin.designpattern.abstract_factory.factory.Item;
import com.luhanlin.designpattern.abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 9:48 AM
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buff = new StringBuffer();
        buff.append("<li>\n");
        buff.append(caption + "\n");
        buff.append("<ul>\n");
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()){
            Item next = iterator.next();
            buff.append(next.makeHtml());
        }
        buff.append("</ul>\n");
        buff.append("</li>\n");

        return buff.toString();
    }
}
