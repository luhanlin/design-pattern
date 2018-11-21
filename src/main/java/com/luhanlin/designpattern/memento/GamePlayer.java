package com.luhanlin.designpattern.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 9:32 AM
 */
public class GamePlayer {

    // 持有的金钱
    private int money;
    // 获得的水果
    private List fruits = new ArrayList();
    // 随机数工具
    private Random random = new Random();

    public static String[] fruitsName = new String[]{
            "橘子","香蕉","橙子","苹果","草莓",
    };

    public GamePlayer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    // 进行游戏
    public void bet(){
        int i = random.nextInt(6) + 1;

        if (i == 1){
            // 持有金钱增加100
            money += 100;
            System.out.println("持有金钱增加100");
        } else if (i == 2){
            money /= 2;
            System.out.println("持有金钱减半");
        } else if (i == 6){
            // 获得水果
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得水果：" + fruit);
        } else {
            System.out.println("什么也没有发生");
        }
    }

    // 保存快照
    public Memento createMemento(){
        Memento memento = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            if (next.startsWith("好吃的")){
                memento.addFruit(next);
            }
        }
        return memento;
    }

    // 撤销
    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }


    private String getFruit() {
        String prifix = "";
        if (random.nextBoolean()){
            prifix = "好吃的";
        }

        return prifix + fruitsName[random.nextInt(fruitsName.length)];
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
