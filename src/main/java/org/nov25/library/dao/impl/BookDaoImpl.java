package org.nov25.library.dao.impl;

import org.nov25.library.dao.BookDao;
import org.nov25.library.model.Book;

import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public int addBook(Book book) {

        return 0;
    }

    @Override
    public int updateBook(Integer id, Book book) {
        return 0;
    }

    @Override
    public List<Book> getBookList() {
        return List.of();
    }
}
