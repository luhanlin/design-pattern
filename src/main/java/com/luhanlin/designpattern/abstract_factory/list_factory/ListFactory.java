package com.luhanlin.designpattern.abstract_factory.list_factory;

import com.luhanlin.designpattern.abstract_factory.factory.Factory;
import com.luhanlin.designpattern.abstract_factory.factory.Link;
import com.luhanlin.designpattern.abstract_factory.factory.Page;
import com.luhanlin.designpattern.abstract_factory.factory.Tray;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 10:01 AM
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
