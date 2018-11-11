package com.luhanlin.designpattern.adapter.practice;

import java.io.IOException;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 11:39 AM
 */
public class Main {

    public static void main(String[] args) {
        FileIO fileIo = new FileProperties();

        try {
            fileIo.readFromFile("/Users/luhanlin/Public/git/my-git-project/design-pattern/src/main/resources/source.txt");
            fileIo.setValue("year", "2004");
            fileIo.setValue("age", "22");
            fileIo.setValue("month", "3");
            fileIo.setValue("day", "23");

            fileIo.writeToFile("/Users/luhanlin/Public/git/my-git-project/design-pattern/src/main/resources/target.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
