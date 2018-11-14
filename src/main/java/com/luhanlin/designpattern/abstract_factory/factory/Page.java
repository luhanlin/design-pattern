package com.luhanlin.designpattern.abstract_factory.factory;

import lombok.AllArgsConstructor;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/14 9:24 AM
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        String fileName = title + ".html";

        try {
            Writer writer = new FileWriter(fileName);
            writer.write(this.createHtml());
            writer.close();
            System.out.println(fileName + " 编写完成。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract String createHtml();
}
