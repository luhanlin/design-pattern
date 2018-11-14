package com.luhanlin.designpattern.abstract_factory.list_factory;

import com.luhanlin.designpattern.abstract_factory.factory.Link;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 9:44 AM
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\"" + url + "\"> "+ caption +" </a></li> \n";
    }
}
