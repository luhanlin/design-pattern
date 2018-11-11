package com.luhanlin.designpattern.adapter.entrustment_way;

/**
 * 类详细描述：委托方式的适配器
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:55 AM
 */
public class PrintBannerAdapter extends Print{

    private Banner banner;

    public PrintBannerAdapter(String name) {
        this.banner = new Banner(name);
    }

    @Override
    public void printWeak() {
        System.out.println("可以在此方法进行弱化处理");
        this.banner.showWithWeak();
    }

    @Override
    public void printStrong() {
        System.out.println("可以在此方法进行强化处理");
        this.banner.showWithStrong();
    }
}
