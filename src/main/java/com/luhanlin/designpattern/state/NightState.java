package com.luhanlin.designpattern.state;

/**
 * 类详细描述：夜晚状态秒速
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 2:16 PM
 */
public class NightState implements State {

    private static NightState nightState = new NightState();

    private NightState() {
    }

    public static NightState getInstance(){
        return nightState;
    }

    @Override
    public void setHour(Context context, int hour) {
        if (hour >= 9 && hour < 17){
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        System.out.println("使用金库(晚上)");
    }

    @Override
    public void doAlarm(Context context) {
        System.out.println("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {
        System.out.println("正常通话(晚上)");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
