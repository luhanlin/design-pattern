package com.luhanlin.designpattern.observer.event;

import java.lang.reflect.Method;

/**
 * 类详细描述：事件定义
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:40 上午
 */
public class Event {

    private Object source;
    private Object target;
    private Method method;
    private String triggerType;
    private long currentTime;

    public Event(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", method=" + method +
                ", triggerType='" + triggerType + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }
}
