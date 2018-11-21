package com.luhanlin.designpattern.flyweight;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 4:01 PM
 */
public class BigString {

    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();

        for (int i = 0; i < bigChars.length; i++) {
            BigChar bigChar = factory.getBigChar(string.charAt(i));
            bigChars[i] = bigChar;
        }
    }
    public BigString(String string, boolean shared) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();

        if (shared){
            for (int i = 0; i < bigChars.length; i++) {
                BigChar bigChar = factory.getBigChar(string.charAt(i));
                bigChars[i] = bigChar;
            }
        } else {
            for (int i = 0; i < bigChars.length; i++) {
                BigChar bigChar = new BigChar(string.charAt(i));
                bigChars[i] = bigChar;
            }
        }

    }

    public void print(){
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
