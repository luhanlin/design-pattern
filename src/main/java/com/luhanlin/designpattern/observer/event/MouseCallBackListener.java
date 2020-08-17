package com.luhanlin.designpattern.observer.event;

/**
 * 类详细描述：监听者，也就是目标对象
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:52 上午
 */
public class MouseCallBackListener {

    public void click(Event event) {
        System.out.println("触发点击事件，event : " + event.toString());
    }

    public void focus(Event event) {
        System.out.println("触发focus事件，event : " + event.toString());
    }

    public void touch(Event event) {
        System.out.println("触发touch事件，event : " + event.toString());
    }
}
