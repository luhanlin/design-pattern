package com.luhanlin.designpattern.observer;

import java.util.Random;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/20 10:50 AM
 */
public class RandomNumberGenerator extends NumberGenerator {

    private int number;
    private Random random = new Random();

    public RandomNumberGenerator(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {

        for (int i = 0; i < 30; i++) {
            number = random.nextInt(40);
            notifyObserver();
        }
    }
}
