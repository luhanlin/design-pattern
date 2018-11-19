package com.luhanlin.designpattern.mediator;

/**
 * 类详细描述：向仲裁者进行报告的组员接口
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/19 10:28 PM
 */
public interface Colleague {

    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
