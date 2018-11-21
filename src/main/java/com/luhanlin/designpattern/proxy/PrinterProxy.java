package com.luhanlin.designpattern.proxy;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 5:09 PM
 */
public class PrinterProxy implements Pintable {

    private String name;
    private Print print;  // 进行委派

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setName(String name) {
        if (print != null){
            print.setName(name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print(String printContent) {
        realize();
        print.print(printContent);
    }

    private synchronized void realize() {
        if (print == null){
            print = new Print(name);
        }


    }
}
