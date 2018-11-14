package com.luhanlin.designpattern.abstract_factory.list_factory;

import com.luhanlin.designpattern.abstract_factory.factory.Item;
import com.luhanlin.designpattern.abstract_factory.factory.Page;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 9:52 AM
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String createHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<!DOCTYPE html>\n");
        buffer.append("<html lang=\"en\">\n");
        buffer.append("<head>\n");
        buffer.append("     <meta charset=\"UTF-8\">\n");
        buffer.append("     <title>"+ title +"</title>\n");
        buffer.append("</head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+ title +"</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = content.iterator();
        while(iterator.hasNext()){
            Item tray = iterator.next();
            buffer.append(tray.makeHtml());
        }

        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+ author +"</address>\n");
        buffer.append("</body>\n");
        buffer.append("</html>\n");
        return buffer.toString();
    }
}
