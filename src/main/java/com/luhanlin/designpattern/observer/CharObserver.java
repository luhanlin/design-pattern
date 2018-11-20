package com.luhanlin.designpattern.observer;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/20 10:56 AM
 */
public class CharObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("CharObserver:");

        for (int i = 0; i < generator.getNumber(); i++) {
            System.out.print('*');
        }
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
