package com.luhanlin.designpattern.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/21 3:35 PM
 */
public class BigChar {

    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;

        // 读取文件
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("/Users/luhanlin/Public/git/my-git-project/design-pattern/src/main/java/com/luhanlin/designpattern/flyweight/big" + charname + ".txt"));

            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = bufferedReader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            bufferedReader.close();
            fontdata = buf.toString();

        } catch (IOException e) {
            fontdata = charname + "?";
        }
    }

    public void print(){
        System.out.println(fontdata);
    }
}
