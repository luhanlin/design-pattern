package com.luhanlin.designpattern.observer;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/20 10:57 AM
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator(100);
        IncrementalNumberGenerator incrementalNumberGenerator = new IncrementalNumberGenerator(2, 52, 5);

        Observer digitObserver = new DigitObserver();
        Observer charObserver = new CharObserver();

        incrementalNumberGenerator.registerObserver(digitObserver);
        incrementalNumberGenerator.registerObserver(charObserver);

        incrementalNumberGenerator.execute();
//        numberGenerator.registerObserver(digitObserver);
//        numberGenerator.registerObserver(charObserver);
//
//        numberGenerator.execute();

    }
}
