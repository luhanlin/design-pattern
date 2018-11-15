package com.luhanlin.designpattern.strategy.practice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
                "Tom","Gaga","John","Allen",
        };

        SortAndPrint sortAndPrint01 = new SortAndPrint(data,new SelectSort());
        SortAndPrint sortAndPrint02 = new SortAndPrint(data,new FastSort(0,data.length-1));
//        sortAndPrint01.execute();
        LocalDateTime now2 = LocalDateTime.now();
        sortAndPrint02.execute();
        System.out.println("FastSort consume time: " + ChronoUnit.MILLIS.between(now2,LocalDateTime.now()));
    }
}
