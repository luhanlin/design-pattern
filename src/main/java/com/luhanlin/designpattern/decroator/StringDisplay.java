package com.luhanlin.designpattern.decroator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:30 PM
 */
public class StringDisplay extends Display {

    private String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    @Override
    public int getColumes() {
        return content.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getContents(int row) {
        if (row == 0) {
            return content;
        }
        return null;
    }
}
