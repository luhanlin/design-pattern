package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：线程不安全的懒汉式
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:09 PM
 */
public class LazyLoadingIncurity {

    private static LazyLoadingIncurity lazyLoading;

    private LazyLoadingIncurity(){}

    public static LazyLoadingIncurity getInstance(){
        if (lazyLoading == null){
            lazyLoading = new LazyLoadingIncurity();
        }
        return lazyLoading;
    }

}
