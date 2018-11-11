package com.luhanlin.designpattern.factory_method.idcard;

import com.luhanlin.designpattern.factory_method.framework.Factory;
import com.luhanlin.designpattern.factory_method.framework.Product;

import java.util.ArrayList;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 5:37 PM
 */
public class IdCardFactory extends Factory {

    private ArrayList<String> idCards = new ArrayList<>();

    @Override
    protected Product createProduct(String owner, String cardNum) {
        return new IdCard(owner, cardNum);
    }

    @Override
    protected void registerProduct(Product product) {
        idCards.add(((IdCard) product).getOwner());
    }
}
