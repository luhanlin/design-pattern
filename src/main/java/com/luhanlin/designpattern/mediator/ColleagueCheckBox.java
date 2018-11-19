package com.luhanlin.designpattern.mediator;

import javafx.scene.control.CheckBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/19 10:35 PM
 */
public class ColleagueCheckBox extends CheckBox implements ItemListener,Colleague {

    private Mediator mediator;

    public ColleagueCheckBox(String text) {
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setDisabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
