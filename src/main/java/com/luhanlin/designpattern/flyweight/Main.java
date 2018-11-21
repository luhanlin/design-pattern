package com.luhanlin.designpattern.flyweight;

import java.util.Random;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 4:09 PM
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(new Random().nextInt(3));

        }
        BigString bigString = new BigString(stringBuilder.toString(), false);
//        bigString.print();
        useMemory();

        // 使用共享时  内存使用：1947272
        // 不使用共享时  内存使用：2528680
    }

    private static void useMemory(){
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("内存使用：" + used);
    }
}
