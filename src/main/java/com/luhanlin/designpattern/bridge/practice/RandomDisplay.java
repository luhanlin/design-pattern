package com.luhanlin.designpattern.bridge.practice;

import com.luhanlin.designpattern.bridge.Display;
import com.luhanlin.designpattern.bridge.DisplayImpl;

import java.util.Random;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 12:59 PM
 */
public class RandomDisplay extends Display {

    public RandomDisplay(DisplayImpl displayimpl) {
        super(displayimpl);
    }

    public void randomDisplay(int randomint){
        int i1 = new Random().nextInt(randomint);
        System.out.println("随机次数为： "+i1);
        open();
        for (int i = 0; i < i1; i++) {
            print();
        }
        close();
    }
}
