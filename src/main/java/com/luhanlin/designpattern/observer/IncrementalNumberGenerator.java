package com.luhanlin.designpattern.observer;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/20 5:24 PM
 */
public class IncrementalNumberGenerator extends NumberGenerator {

    private int init;
    private int finish;
    private int step;

    public IncrementalNumberGenerator(int init, int finish, int step) {
        this.init = init;
        this.finish = finish;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return init;
    }

    @Override
    public void execute() {
        for (int i = init; i < finish; i += step) {
            init = i;
            notifyObserver();
        }

    }
}
