package com.luhanlin.designpattern.proxy;

/**
 * 类详细描述：一致性接口
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 5:02 PM
 */
public interface Pintable {

    void setName(String name);

    String getName();

    void print(String printContent);
}
