package com.luhanlin.designpattern.singleton;

/**
 * @description: HungrySingleton02 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 11:18
 **/
public class HungrySingleton02Test extends SingletonTest<HungrySingleton02> {

    /**
     * error :
     *      org.opentest4j.AssertionFailedError: expected: not <null>
     */
    public HungrySingleton02Test() {
        super(() -> HungrySingleton02.getInstance());
    }
}
