package com.luhanlin.designpattern.decroator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:51 PM
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumes() {
        return 1 + display.getColumes() +1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() +1;
    }

    @Override
    public String getContents(int row) {
        if (row == 0){
            // 上边框
            return "+" + makeLine('-', display.getColumes()) + "+";
        } else if (row == display.getRows() +1) {
            return "+" + makeLine('-', display.getColumes()) + "+";
        } else {
            return "|" + display.getContents(row - 1) + "|";
        }
    }

    private String makeLine(char s, int columes) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < columes; i++) {
            buffer.append(s);
        }
        return buffer.toString();
    }
}
