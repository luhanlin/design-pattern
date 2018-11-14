package com.luhanlin.designpattern.strategy;

import java.util.Random;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 4:59 PM
 */
public class ProbStrategy implements Strategy {

    private Random random;
    private int prevValue = 0;
    private int currentValue = 0;
    private int[][] history = new int[][]{
            {1,1,1},
            {1,1,1},
            {1,1,1},
    };

    public ProbStrategy() {
        this.random = new Random();
    }

    @Override
    public Hander nextHander() {
        int sum = getSum(currentValue);
        int yet = random.nextInt(sum);
        int handValue = 0;
        if (yet < history[currentValue][0]){
            handValue = 0;
        } else if (yet < history[currentValue][0] + history[currentValue][1]){
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevValue = currentValue;
        currentValue = handValue;

        return Hander.getHander(handValue);
    }

    private int getSum(int currentValue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[currentValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win){
            history[prevValue][currentValue]++;
        } else {
            history[prevValue][(currentValue + 1) % 3]++;
            history[prevValue][(currentValue + 2) % 3]++;
        }

    }
}
