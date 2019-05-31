package com.luhanlin.designpattern.singleton;

/**
 * @description: LazyLoadingUnSafety 测试
 * @author: Mr.Lu
 * @create: 2019-05-31 11:24
 **/
public class LazyLoadingUnSafetyTest extends SingletonTest<LazyLoadingUnSafety> {

    public LazyLoadingUnSafetyTest() {
        super(() -> LazyLoadingUnSafety.getInstance());
    }
}
