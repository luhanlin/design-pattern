package com.luhanlin.designpattern.adapter.extends_way;

/**
 * 类详细描述：适配类
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:43 AM
 */
public class PrintBannerAdapter extends Banner implements Print{

    public PrintBannerAdapter(String name) {
        super(name);
    }

    @Override
    public void printWeak() {
        System.out.println("可以在此方法进行弱化处理");
        showWithWeak();
    }

    @Override
    public void printStrong() {
        System.out.println("可以在此方法进行强化处理");
        showWithStrong();
    }
}
