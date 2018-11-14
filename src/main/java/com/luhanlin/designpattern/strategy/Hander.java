package com.luhanlin.designpattern.strategy;

/**
 * 类详细描述：出手实体
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 4:41 PM
 */
public class Hander {

    private static final int HANDVALUT_GUU = 0; // 石头
    private static final int HANDVALUT_CHO = 1; // 剪刀
    private static final int HANDVALUT_PAA = 2; // 布

    private static final Hander[] handler = new Hander[]{
            new Hander(HANDVALUT_GUU),
            new Hander(HANDVALUT_CHO),
            new Hander(HANDVALUT_PAA),
    };

    private static final String[] handlerName = new String[]{
            "石头","剪刀","布"
    };

    private int initValue;

    public Hander(int initValue) {
        this.initValue = initValue;
    }

    public static Hander getHander(int handValue){
        return handler[handValue];
    }

    public boolean strongThan(Hander hander){
        return fight(hander) == 1;
    }

    public boolean weakThan(Hander hander){
        return fight(hander) == 1;
    }

    private int fight(Hander hander) {
        if (this == hander){
            return 0;
        } else if ((this.initValue + 1) % 3 == hander.initValue){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return handlerName[initValue];
    }
}
