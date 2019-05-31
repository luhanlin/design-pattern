package com.luhanlin.designpattern.singleton;

/**
 * @description: DoubleLockSingleton 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 11:07
 **/
public class DoubleLockSingletonTest extends SingletonTest<DoubleLockSingleton> {

    public DoubleLockSingletonTest() {
        super(() -> DoubleLockSingleton.getInstance());
    }
}
