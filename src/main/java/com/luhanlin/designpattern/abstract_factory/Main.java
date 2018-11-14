package com.luhanlin.designpattern.abstract_factory;


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
 * 创建时间：2018/11/14 9:01 AM
 */
public class Main {

    public static void main(String[] args) {
        Factory listFactory = Factory.getFactory("com.luhanlin.designpattern.abstract_factory.list_factory.ListFactory");

        Link baiduLink = listFactory.createLink("百度", "http://www.baidu.com");
        Link googleLink = listFactory.createLink("google", "http://www.google.com");

        Tray tray = listFactory.createTray("网站");
        tray.add(baiduLink);
        tray.add(googleLink);

        Page page = listFactory.createPage("网站首页", "luhanlin");
        page.add(tray);

        page.output();

    }
}
