package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：线程安全的懒汉式
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:09 PM
 */
public class LazyLoadingSafe {

    private static LazyLoadingSafe lazyLoading;

    private LazyLoadingSafe(){}

    public static synchronized LazyLoadingSafe getInstance(){
        if (lazyLoading == null){
            lazyLoading = new LazyLoadingSafe();
        }
        return lazyLoading;
    }

}
