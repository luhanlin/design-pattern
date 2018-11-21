package com.luhanlin.designpattern.memento;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 9:48 AM
 */
public class Main {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer(100);
        Memento memento = gamePlayer.createMemento();

        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i + ", 当前状态： " + gamePlayer);
            // 进行游戏
            gamePlayer.bet();

            int money = gamePlayer.getMoney();
            if (money > memento.getMoney()){
                System.out.println("持有金钱增加，保存当期状态");
                memento = gamePlayer.createMemento();
            } else if (money < memento.getMoney() / 2){
                System.out.println("持有金额减少许多，回复游戏之前状态");
                gamePlayer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
