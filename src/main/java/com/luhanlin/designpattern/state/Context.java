package com.luhanlin.designpattern.state;

/**
 * 类详细描述：环境上下文，负责联系报警中心和管理状态
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 2:04 PM
 */
public interface Context {

    // 设施闹钟时间
    void setHour(int hour);

    // 根据时间更改装填
    void changeState(State state);

    // 呼叫警报中心
    void callSecurityCenter(String msg);

    // 在警报中心留下记录
    void recordLog(String msg);

}
