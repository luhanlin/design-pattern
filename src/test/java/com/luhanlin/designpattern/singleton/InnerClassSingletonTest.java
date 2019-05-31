package com.luhanlin.designpattern.singleton;

/**
 * @description: InnerClassSingleton 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 11:22
 **/
public class InnerClassSingletonTest extends SingletonTest<InnerClassSingleton> {

    public InnerClassSingletonTest() {
        super(() -> InnerClassSingleton.getInstance());
    }
}
