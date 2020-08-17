package com.luhanlin.designpattern.observer.jdk;

/**
 * 类详细描述：事件集
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2020/8/7 10:05 上午
 */
public class Question {

    private String studentName;
    private String content;

    public Question(String studentName, String content) {
        this.studentName = studentName;
        this.content = content;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
