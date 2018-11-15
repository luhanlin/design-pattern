package com.luhanlin.designpattern.strategy.practice;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 类详细描述：快速排序算法,此处有点问题，后面修改
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:40 AM
 */
@AllArgsConstructor
@NoArgsConstructor
public class FastSort implements Sort{

    private int left;
    private int right;

    @Override
    public void sort(Comparable[] data) {

        quickSort(data, left, right);
    }

    private void quickSort(Comparable[] data, int left, int right) {
        int i = left;
        int j = right;

        // 定义基础值
        Comparable base = data[left];

        if (i > j){
            return;
        }

        while (i != j){
            // data[j] 值比base大进入循环,从后往前比较
            System.out.println(base.compareTo(data[j]));
            while (i < j && base.compareTo(data[j]) <= 0){
                j--;
                // data[j] 值比base小进行比较交换
                if (base.compareTo(data[j]) > 0){
                    // 比较交换
                    swap(data, j, i);
                }
            }
            // data[i] 值比base小进入循环,从前往后比较
            while (i < j && base.compareTo(data[i]) >= 0 ){
                i++;
                if (base.compareTo(data[i]) < 0){
                    // 比较交换
                    swap(data, i, j);
                }
            }
        }

        // 比较完毕后 left与right 值应该相等
//        data[i] = base;
        // 进行左边比较
        if (left < i) quickSort(data, left, i-1);
        // 进行右边比较
        if (j < right) quickSort(data, j + 1, right);
    }

    private void swap(Comparable[] data, int i, int j) {
        Comparable base = data[i];
        data[i] = data[j];
        data[j] = base;
    }
}
