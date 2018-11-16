package com.luhanlin.designpattern.chain_of_responsibility;

import lombok.Data;

/**
 * 类详细描述：需要解决的问题
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 1:14 PM
 */
@Data
public class Trouble {

    private int number;

    public Trouble(int number) {
        this.number = number;
    }
}
