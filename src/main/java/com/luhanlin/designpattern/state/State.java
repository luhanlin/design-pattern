package com.luhanlin.designpattern.state;

/**
 * 类详细描述：状态接口类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 2:02 PM
 */
public interface State {

    // 设置时间
    void setHour(Context context, int hour);
    // 以下位根据状态进行动作的抽象接口
    void doUse(Context context);    // 使用金库
    void doAlarm(Context context);  // 按下警铃
    void doPhone(Context context);  // 正常通话

}
