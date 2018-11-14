package com.luhanlin.designpattern.strategy;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 5:32 PM
 */
public class Main {

    public static void main(String[] args) {
        Player xiaoming = new Player("xiaoming", new WinStrategy());
        Player john = new Player("John", new WinStrategy());

        for (int i = 0; i < 10000; i++) {
            Hander hander01 = xiaoming.nextHandler();
            Hander hander02 = john.nextHandler();

            if (hander01.strongThan(hander02)){
                System.out.println("winner : " + xiaoming);
                xiaoming.win();
                john.lose();
            } else if (hander02.strongThan(hander01)){
                System.out.println("winner :" + john);
                xiaoming.lose();
                john.win();
            } else {
                System.out.println("Enen...");
                xiaoming.even();
                john.even();
            }
        }

        System.out.println("total result:");
        System.out.println(xiaoming.toString());
        System.out.println(john.toString());



    }
}
