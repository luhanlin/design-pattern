package com.luhanlin.designpattern.composite;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/15 6:23 PM
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("**********");
        Directory root = new Directory("root");
        Directory usr = new Directory("usr");
        Directory local = new Directory("local");
        Directory host = new Directory("host");
        root.add(usr);
        root.add(local);
        root.add(host);

        usr.add(new File("test",1000));
        usr.add(new File("join",3000));

        root.print();
    }
}
