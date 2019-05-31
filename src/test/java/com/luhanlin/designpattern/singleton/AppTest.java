package com.luhanlin.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.time.Duration;

/**
 * @description:
 * @author: Mr.Lu
 * @create: 2019-05-31 10:21
 **/
public class AppTest {

    @Test
    public void test() {
        String[] args = {};
        SingletonApp.main(args);
    }

    @Test
    public void testOthers(){
        Duration duration = Duration.ofMillis(1000);

        System.out.println(duration.getSeconds());
    }
}
