package com.luhanlin.designpattern.builder;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 11:46 PM
 */
public class TxtBuilder extends Builder {

    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    protected void buildTitle(String title) {
        stringBuffer.append("=============\n");
        stringBuffer.append("「" + title + "」\n");
        stringBuffer.append("\n");
    }

    @Override
    protected void buildString(String string) {
        stringBuffer.append("♦️" + string + "\n");
        stringBuffer.append("\n");
    }

    @Override
    protected void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuffer.append(" ·" + items[i] + "\n");
            stringBuffer.append("\n");
        }
    }

    @Override
    protected void buildClose() {
        stringBuffer.append("=============\n");
    }

    public String getResult(){
        return stringBuffer.toString();
    }
}
