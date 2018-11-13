package com.luhanlin.designpattern.prototype;

import java.util.HashMap;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/13 5:25 PM
 */
public class Manager {

    private HashMap<String,Product> showCase = new HashMap();

    public void registerProduct(String name, Product product){
        this.showCase.put(name, product);
    }

    public Product getProduct(String protoName){
        Product product = this.showCase.get(protoName);
        return product.createCase();
    }

}
