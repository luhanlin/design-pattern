package com.luhanlin.designpattern.command;

import com.luhanlin.designpattern.command.hello.HelloAllen;
import com.luhanlin.designpattern.command.hello.HelloBob;
import com.luhanlin.designpattern.command.hello.HelloCommand;
import com.luhanlin.designpattern.command.hello.Helloable;
import com.luhanlin.designpattern.command.mand.MacroCommand;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/22 8:57 AM
 */
public class Main {

    public static void main(String[] args) {
        Helloable allen = new HelloAllen();
        Helloable bob = new HelloBob();

        MacroCommand macroCommand = new MacroCommand();

        macroCommand.addCommand(new HelloCommand(allen));
        macroCommand.addCommand(new HelloCommand(bob));

        macroCommand.execute();

    }
}
