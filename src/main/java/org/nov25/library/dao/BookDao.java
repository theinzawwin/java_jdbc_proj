package org.nov25.library.dao;

import org.nov25.library.model.Book;

import java.util.List;

public interface BookDao {
    int addBook(Book book);

    int updateBook(Integer id,Book book);

    List<Book> getBookList();
}
