package com.luhanlin.designpattern.builder;

/**
 * 类详细描述：构建模版
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 11:39 PM
 */
public abstract class Builder {

    private Boolean initialized = false;

    public void makeTitle(String title){
        if (!initialized){
            buildTitle(title);
            initialized = true;
        }
    }

    public void makeString(String string){
        if (initialized){
            buildString(string);
        }
    }

    public void makeItems(String[] items){
        buildItems(items);
    }

    public void close(){
        buildClose();
    }


    protected abstract void buildTitle(String title);

    protected abstract void buildString(String string);

    protected abstract void buildItems(String[] items);

    protected abstract void buildClose();
}
