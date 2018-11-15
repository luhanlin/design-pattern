package com.luhanlin.designpattern.strategy.practice;

import com.luhanlin.designpattern.strategy.Hander;
import com.luhanlin.designpattern.strategy.Strategy;

import java.util.Random;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 9:37 AM
 */
public class RandomStrategy implements Strategy {

    @Override
    public Hander nextHander() {
        int i = new Random().nextInt(3);
        return Hander.getHander(i);
    }

    @Override
    public void study(boolean win) {

    }
}
