package com.luhanlin.designpattern.state;

/**
 * 类详细描述：白天的状态 使用单利
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 2:11 PM
 */
public class DayState implements State {

    private static DayState dayState = new DayState();

    private DayState() {
    }

    public static DayState getInstance(){
        return dayState;
    }

    @Override
    public void setHour(Context context, int hour) {
        if (hour < 9 || hour >= 17){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        System.out.println("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        System.out.println("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        System.out.println("正常通话(白天)");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
