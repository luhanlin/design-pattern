package com.luhanlin.designpattern.Iterator;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/11 9:22 AM
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(new Book(" the first book "));
        bookShelf.addBook(new Book(" the second book "));
        bookShelf.addBook(new Book(" the third book "));
        bookShelf.addBook(new Book(" the fourth book "));

        MyIterator it = bookShelf.iterator();

        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getBook_name());
        }

    }
}
