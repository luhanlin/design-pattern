package com.luhanlin.designpattern.strategy;

import java.util.Random;

/**
 * 类详细描述：获胜策略
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 4:54 PM
 */
public class WinStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hander prevHander;

    public WinStrategy() {
        this.random = new Random();
    }

    @Override
    public Hander nextHander() {
        // 如果没有赢
        if (!won){
            prevHander = Hander.getHander(random.nextInt(3));
        }

        return prevHander;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
