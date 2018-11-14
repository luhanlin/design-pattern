package com.luhanlin.designpattern.bridge.practice;

import com.luhanlin.designpattern.bridge.DisplayImpl;

import java.io.*;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 1:09 PM
 */
public class TxtDisplayImpl extends DisplayImpl {

    private String fileName;
    private BufferedReader reader;

    private static final int MAX_LIMIT = 4096;

    public TxtDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOPen() {
        try {
            this.reader = new BufferedReader(new FileReader(fileName));
            reader.mark(MAX_LIMIT);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("============= " + fileName + " ==============");
    }

    @Override
    public void rawPrint() {
        try {
            reader.reset();
            String line = null;
            while ((line = reader.readLine()) != null ){
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawclose() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
