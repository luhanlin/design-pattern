package com.luhanlin.designpattern.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 类详细描述：具体使用所有的类，此处可以进行优化进行组件的注册
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/19 10:39 PM
 */
public class LoginMediator extends Frame implements ActionListener,Mediator {

    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancal;
    private ColleagueCheckBox checkGuest;
    private ColleagueCheckBox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;

    public LoginMediator(String title) throws HeadlessException {
        super(title);

    }

    @Override
    public void createColleagues() {

    }

    @Override
    public void colleagueChanged() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
