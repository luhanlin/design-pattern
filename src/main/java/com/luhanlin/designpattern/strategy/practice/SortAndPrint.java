package com.luhanlin.designpattern.strategy.practice;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 11:34 AM
 */
public class SortAndPrint {

    private Comparable[] data;
    private Sort sort;

    public SortAndPrint(Comparable[] data, Sort sort) {
        this.data = data;
        this.sort = sort;
    }

    public void execute(){
        print();
        sort.sort(data);
        print();
    }

    private void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");

        }
        System.out.println("**********");
    }
}
