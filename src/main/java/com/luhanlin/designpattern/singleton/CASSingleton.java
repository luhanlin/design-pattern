package com.luhanlin.designpattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @description: CAS实现的单例模式
 * @author: Mr.Lu
 * @create: 2019-05-31 11:55
 **/
public class CASSingleton {

    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<>();

    public CASSingleton() {
    }

    /**
     * 利用CAS确保线程安全
     * @return
     */
    public static final CASSingleton getInstance() {
        for (;;) {
            CASSingleton currentInstance = INSTANCE.get();

            if (currentInstance != null) {
                return currentInstance;
            }

            currentInstance = new CASSingleton();

            if (INSTANCE.compareAndSet(null, currentInstance)) {
                return currentInstance;
            }
        }
    }
}
