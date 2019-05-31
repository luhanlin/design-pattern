package com.luhanlin.designpattern.singleton;

/**
 * @description:
 * @author: Mr.Lu
 * @create: 2019-05-31 11:47
 **/
public class ThreadLocalSingletonTest extends SingletonTest<ThreadLocalSingleton> {

    /**
     * error:
     *      org.opentest4j.AssertionFailedError:
     *      Expected :com.luhanlin.designpattern.singleton.ThreadLocalSingleton@7e0b0338
     *      Actual   :com.luhanlin.designpattern.singleton.ThreadLocalSingleton@617faa95
     */
    public ThreadLocalSingletonTest() {
        super(() -> ThreadLocalSingleton.getInstance());
    }
}
