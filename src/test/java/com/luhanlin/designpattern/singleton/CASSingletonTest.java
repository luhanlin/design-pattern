package com.luhanlin.designpattern.singleton;

/**
 * @description: CASSingleton 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 12:02
 **/
public class CASSingletonTest extends SingletonTest<CASSingleton>{

    public CASSingletonTest() {
        super(() -> CASSingleton.getInstance());
    }
}
