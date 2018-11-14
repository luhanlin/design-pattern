package com.luhanlin.designpattern.bridge;

import com.luhanlin.designpattern.bridge.practice.CharDisplayImpl;
import com.luhanlin.designpattern.bridge.practice.IncreaseDispaly;
import com.luhanlin.designpattern.bridge.practice.RandomDisplay;
import com.luhanlin.designpattern.bridge.practice.TxtDisplayImpl;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 12:41 PM
 */
public class Main {

    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("hello china"));
        Display countDisplay01 = new CountDisplay(new StringDisplayImpl("hello word"));
        CountDisplay countDisplay02 = new CountDisplay(new StringDisplayImpl("hello english"));
        RandomDisplay random = new RandomDisplay(new StringDisplayImpl("hello random"));
        Display txtDisplay = new CountDisplay(new TxtDisplayImpl("/Users/luhanlin/Public/git/my-git-project/design-pattern/src/main/resources/test.html"));
        IncreaseDispaly increaseDispaly01 = new IncreaseDispaly(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDispaly increaseDispaly02 = new IncreaseDispaly(new CharDisplayImpl('|', '#', '-'), 1);


        display.display();
        countDisplay01.display();
        countDisplay02.display();
        countDisplay02.multiDisplay(5);

        random.randomDisplay(10);

        txtDisplay.display();

        increaseDispaly01.increaseDisplay(6);
        increaseDispaly02.increaseDisplay(6);
    }
}
