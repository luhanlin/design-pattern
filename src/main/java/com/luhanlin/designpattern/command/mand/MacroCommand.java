package com.luhanlin.designpattern.command.mand;

import java.util.Iterator;
import java.util.Stack;

/**
 * 类详细描述：多命令的聚合
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/22 9:17 AM
 */
public class MacroCommand implements Command {

    // 采用java栈进行命令存储
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()){
            Command command = (Command) iterator.next();
            command.execute();
        }
    }

    // 添加指令
    public void addCommand(Command command){
        if (command != this)
        commands.push(command);
    }

    // 删除最后指令
    public Command removeCommand(){
        Command command = null;

        if (!commands.empty()){
            command = (Command) commands.pop();
        }
        return command;
    }

    // 删除所有指令
    public void clearCommand(){
        commands.clear();
    }
}
