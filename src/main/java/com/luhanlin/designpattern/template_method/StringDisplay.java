package com.luhanlin.designpattern.template_method;

import lombok.AllArgsConstructor;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 2:25 PM
 */
public class StringDisplay extends AbstractDisplay{

    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    protected void open() {
        println();
    }

    @Override
    protected void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    protected void close() {
        println();
    }

    private void println(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
