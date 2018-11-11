package com.luhanlin.designpattern.Iterator;

/**
 * 类详细描述：自定义遍历器
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 9:18 AM
 */
public class BookShelfIterator implements MyIterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index < this.bookShelf.length()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return this.bookShelf.getBook(index++);
    }
}
