package com.luhanlin.designpattern.bridge.practice;

import com.luhanlin.designpattern.bridge.CountDisplay;
import com.luhanlin.designpattern.bridge.DisplayImpl;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 1:41 PM
 */
public class IncreaseDispaly extends CountDisplay {

    // 每次增长的长度
    private int step;

    public IncreaseDispaly(DisplayImpl displayimpl, int step) {
        super(displayimpl);
        this.step = step;
    }

    public void increaseDisplay(int level){

        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);

            count += step;
        }
    }
}
