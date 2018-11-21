package com.luhanlin.designpattern.state;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 2:31 PM
 */
public class Main {

    public static void main(String[] args) {
        SafeFrame simple = new SafeFrame("state simple");
        while (true){
            for (int i = 0; i < 24; i++) {
                simple.setHour(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
