package com.luhanlin.designpattern.strategy.practice;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:37 AM
 */
public class Main {
    public static void main(String[] args) {

        String[] data = new String[]{
                "Tom","John","Gaga","Allen",
        };

        SortAndPrint sortAndPrint = new SortAndPrint(data,new SelectSort());
        sortAndPrint.execute();

    }
}
