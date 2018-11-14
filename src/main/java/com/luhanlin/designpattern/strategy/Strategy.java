package com.luhanlin.designpattern.strategy;

public interface Strategy {

    Hander nextHander();

    void study(boolean win);
}
