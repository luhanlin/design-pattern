package com.luhanlin.designpattern.adapter.practice;

import java.io.*;
import java.util.Properties;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 11:39 AM
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(new File(fileName)));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(new File(fileName)),"write file");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
