package com.luhanlin.designpattern.singleton;

/**
 * @description: HungrySingleton 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 11:18
 **/
public class HungrySingletonTest extends SingletonTest<HungrySingleton> {
    
    public HungrySingletonTest() {
        super(() -> HungrySingleton.getInstance());
    }
}
