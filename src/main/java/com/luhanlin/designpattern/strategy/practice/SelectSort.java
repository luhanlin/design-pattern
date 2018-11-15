package com.luhanlin.designpattern.strategy.practice;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:26 AM
 */
public class SelectSort implements Sort{

    @Override
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[index].compareTo(data[j]) > 0){
                    index = j;
                }
            }

            Comparable comparable = data[index];
            data[index] = data[i];
            data[i] = comparable;
        }
    }
}
