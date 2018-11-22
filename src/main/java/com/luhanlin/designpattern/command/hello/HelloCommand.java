package com.luhanlin.designpattern.command.hello;

import com.luhanlin.designpattern.command.mand.Command;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/22 9:31 AM
 */
public class HelloCommand implements Command {

    // 使用具体的类
    private Helloable helloable;

    public HelloCommand(Helloable helloable) {
        this.helloable = helloable;
    }

    @Override
    public void execute() {
        helloable.hello();
    }
}
