package com.luhanlin.designpattern.factory_method.framework;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 5:32 PM
 */
public abstract class Factory {

    public final Product create(String owner, String cardNum){
        Product product = createProduct(owner,cardNum);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner, String cardNum);

    protected abstract void registerProduct(Product product);
}
