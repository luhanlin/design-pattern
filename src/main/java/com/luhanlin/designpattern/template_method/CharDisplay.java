package com.luhanlin.designpattern.template_method;

import lombok.AllArgsConstructor;

import java.io.InputStream;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 2:24 PM
 */
@AllArgsConstructor
public class CharDisplay extends AbstractDisplay{
    private String ch;

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(ch);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }
}
