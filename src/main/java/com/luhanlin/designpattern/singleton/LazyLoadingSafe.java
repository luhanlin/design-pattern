package com.luhanlin.designpattern.singleton;

/**
 * 类详细描述：线程安全的懒汉式
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 10:09 PM
 */
public final class LazyLoadingSafe {

    private static LazyLoadingSafe lazyLoading;

    private LazyLoadingSafe(){
        // 避免通过反射进行实例的初始化
        if (lazyLoading == null) {
            lazyLoading = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * 通过synchronized 关键字进行实例化方法的线程安全
     * @return LazyLoadingSafe 返回的单实例
     */
    public static synchronized LazyLoadingSafe getInstance(){
        if (lazyLoading == null){
            lazyLoading = new LazyLoadingSafe();
        }
        return lazyLoading;
    }

}
