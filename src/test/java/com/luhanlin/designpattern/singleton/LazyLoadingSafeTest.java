package com.luhanlin.designpattern.singleton;

/**
 * @description:
 * @author: Mr.Lu
 * @create: 2019-05-31 11:29
 **/
public class LazyLoadingSafeTest extends SingletonTest<LazyLoadingSafe> {

    public LazyLoadingSafeTest() {
        super(() -> LazyLoadingSafe.getInstance());
    }
}
