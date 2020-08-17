package com.luhanlin.designpattern.observer.jdk;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:17 上午
 */
public class ObservableTest {

    public static void main(String[] args) {
        ClassRoom classRoom = ClassRoom.getInstance();
        classRoom.addObserver(new Teacher("teacher zhang"));
        classRoom.addObserver(new Teacher("teacher wang"));
        classRoom.pushQuestion(new Question("Tom", "老师，什么是小硬币？"));
        classRoom.pushQuestion(new Question("Tom", "老师，什么是小葡萄？"));
    }
}
