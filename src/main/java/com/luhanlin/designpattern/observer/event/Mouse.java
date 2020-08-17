package com.luhanlin.designpattern.observer.event;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 11:07 上午
 */
public class Mouse extends EventListenable{

    public void click(){
        System.out.println("触发点击事件");
        this.trigger(MouseEventType.CLICK);
    }
}
