package com.luhanlin.designpattern.proxy;

/**
 * 类详细描述：本人
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 5:04 PM
 */
public class Print implements Pintable{

    private String name;

    public Print(String name) {
        this.name = name;
        heavyJob("正在生成print的实例 (" + name + ")");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private void heavyJob(String s) {
        System.out.print(s);
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(String printContent) {
        System.out.println("===" + name + "====");
        System.out.println(printContent);
    }
}
