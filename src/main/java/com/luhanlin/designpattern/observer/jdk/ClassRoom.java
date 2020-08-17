package com.luhanlin.designpattern.observer.jdk;

import java.util.Observable;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:01 上午
 */
public class ClassRoom extends Observable {

    private String name = "课堂";

    private static ClassRoom classRoom;

    private ClassRoom() {}

    public static ClassRoom getInstance(){
        if (classRoom == null) {
            classRoom = new ClassRoom();
        }
        return classRoom;
    }

    public void pushQuestion(Question question) {
        System.out.println(question.getStudentName() + "在" + this.name + "上提出了一个问题：" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
