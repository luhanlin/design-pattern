package com.luhanlin.designpattern.observer.event;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 11:09 上午
 */
public class ListenerTest {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        MouseCallBackListener target = new MouseCallBackListener();
        mouse.addListener(MouseEventType.CLICK, target);
        mouse.addListener(MouseEventType.FOCUS, target);
        mouse.addListener(MouseEventType.TOUCH, target);
        mouse.click();
    }
}
