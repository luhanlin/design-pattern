package com.luhanlin.designpattern.Iterator;

import java.util.ArrayList;

/**
 * 类详细描述：书架，表示一个集合
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 9:06 AM
 */
public class BookShelf implements Aggregate{

    private ArrayList<Book> books;
    private int last;

    public BookShelf() {
        // 初始化 books 集合
        this.books = new ArrayList<>();
    }

    // 往集合中添加方法
    public void addBook(Book book){
        this.books.add(book);
        last++;
    }

    public Book getBook(int index){
        return this.books.get(index);
    }

    // 获取集合的长度
    public int length(){
        return last;
    }

    @Override
    public MyIterator iterator() {
        return new BookShelfIterator(this);
    }
}
