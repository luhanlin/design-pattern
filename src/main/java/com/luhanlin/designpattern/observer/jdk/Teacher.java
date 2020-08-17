package com.luhanlin.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:14 上午
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        ClassRoom c = (ClassRoom) o;
        Question que = (Question) arg;

        System.out.println("老师" + this.name + " 收到了学生" + que.getStudentName() + "的提问");
    }
}
