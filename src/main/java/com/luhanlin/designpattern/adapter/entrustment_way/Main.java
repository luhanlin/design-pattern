package com.luhanlin.designpattern.adapter.entrustment_way;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:46 AM
 */
public class Main {

    public static void main(String[] args) {
        // 此处使用多态的方式
//        Print print = new PrintBannerAdapter("hello");
//
//        print.printWeak();
//        print.printStrong();
        print();

    }
    
    // 斐波那契数列
    private static void print(){
        // 需要打印数列的前40项
        int[] a = new int[40];

        int n = 0;
        for (int i = 2; i < 40; i++) {
            a[0] = 1;
            a[1] = 1;
            a[i] = a[i-1] + a[i-2];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%12d",a[i]);
            n++;
            if (n % 5 ==0){
                System.out.println();
            }
        }
    }
}
