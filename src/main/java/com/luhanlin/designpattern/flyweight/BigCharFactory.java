package com.luhanlin.designpattern.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 类详细描述：大字符工厂，采用单例
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 3:54 PM
 */
public class BigCharFactory {

    public ConcurrentHashMap pool = new ConcurrentHashMap();

    private static BigCharFactory bigCharFactory = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance(){
        return bigCharFactory;
    }

    public synchronized BigChar getBigChar(char charName){
        BigChar bigChar = (BigChar) pool.get("" + charName);

        if (bigChar == null){
            bigChar = new BigChar(charName);
            pool.put(""+ charName, bigChar);
        }
        return bigChar;
    }
}
