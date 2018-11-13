package com.luhanlin.designpattern.prototype;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 5:35 PM
 */
public class UnderlinePen extends CloneCommon {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println();

        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length +2; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

}
