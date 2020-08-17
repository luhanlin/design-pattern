package com.luhanlin.designpattern.observer.event;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 类详细描述 ： 中间人，相当于平台
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:40 上午
 */
public class EventListenable {

    private static final Map<String, Event> map = new HashMap<>();

    public void addListener(String eventType, Object target) {
        try {
            map.put(eventType, new Event(target, target.getClass().getMethod(eventType, Event.class)));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void trigger(String type){
        if (map.containsKey(type)) {
            Event event = map.get(type);
            event.setSource(this);
            event.setCurrentTime(System.currentTimeMillis());
            try {
                event.getMethod().invoke(event.getTarget(),event);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
