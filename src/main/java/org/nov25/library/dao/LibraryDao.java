package org.nov25.library.dao;

import org.nov25.library.model.BorrowBook;

import java.sql.Date;

public interface LibraryDao {

    int borrowBook(BorrowBook borrowBook);
    int returnBook(int borrowId, Date returnDate);
}
