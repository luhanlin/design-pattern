package com.luhanlin.designpattern.factory_method.idcard;

import com.luhanlin.designpattern.factory_method.framework.Product;
import lombok.Data;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 5:35 PM
 */
@Data
public class IdCard extends Product {

    private String owner;
    private String cardNum;

    IdCard(String owner, String cardNum) {
        System.out.println("制作 " + owner + " 的卡片");
        this.owner = owner;
        this.cardNum = cardNum;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的卡片");
    }
}
