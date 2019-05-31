package com.luhanlin.designpattern.singleton;

/**
 * @description: EnumSingleton 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 11:10
 **/
public class EnumSingletonTest extends SingletonTest<EnumSingleton> {
    public EnumSingletonTest() {
        super(() -> EnumSingleton.getInstance());
    }
}
