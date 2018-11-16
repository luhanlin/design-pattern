package com.luhanlin.designpattern.chain_of_responsibility;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 1:29 PM
 */
public class Main {

    public static void main(String[] args) {
        NoSupport no_support = new NoSupport("no support ");
        LimitSupport limit_support = new LimitSupport("limit support ", 100);
        OddSupport odd_support = new OddSupport("odd support ");
        SpecialSupport special_support = new SpecialSupport("special support ", 238);

        // 此处返回的是最后一个special——support
        Support support = no_support.setNext(limit_support).setNext(odd_support).setNext(special_support);

        for (int i = 0; i < 500; i +=34) {
            no_support.support(new Trouble(i));
        }

    }
}
