package com.luhanlin.designpattern.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

/**
 * @description: 单例模式测试抽象类
 * @author: Mr.Lu
 * @create: 2019-05-31 10:32
 **/
public abstract class SingletonTest<S> {

    /**
     * Supplier 官方释义：
     *  There is no requirement that a new or distinct result be returned each
     *  time the supplier is invoked.
     *
     *  此处是一个单例模式中获取单例的方法（getInstance() ）
     */
    private final Supplier<S> singletonInstanceMethod;

    /**
     * @param singletonInstanceMethod 单例方法的 getInstance()
     */
    public SingletonTest(Supplier<S> singletonInstanceMethod) {
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    /**
     * 在单线程当中测试单例
     */
    @Test
    public void testSingletonInSameThread(){
        S singleton1 = this.singletonInstanceMethod.get();
        S singleton2 = this.singletonInstanceMethod.get();
        S singleton3 = this.singletonInstanceMethod.get();

        Assertions.assertSame(singleton1, singleton2);
        Assertions.assertSame(singleton1, singleton3);
        Assertions.assertSame(singleton3, singleton2);
    }

    /**
     * 在多线程当中测试单例
     */
    @Test
    public void testSingletonInDifferentThread(){
        // 设定 1 秒超时
        Assertions.assertTimeout(Duration.ofMillis(1000),() -> {
            final List<Callable<S>> tasks = new ArrayList<>();

            for (int i = 0; i < 1000000; i++) {
                tasks.add(this.singletonInstanceMethod::get);
            }

            final ExecutorService executorService = Executors.newFixedThreadPool(8);

            // invokeAll 会等待线程完成，期间进行线程的阻塞
            List<Future<S>> futures = executorService.invokeAll(tasks);

            final S expectedInstance = this.singletonInstanceMethod.get();

            for (Future<S> future : futures) {
                final S instance = future.get();

                Assertions.assertNotNull(instance);
                Assertions.assertSame(expectedInstance, instance);
            }

            // 关闭线程池
            executorService.shutdown();
        });
    }

}
