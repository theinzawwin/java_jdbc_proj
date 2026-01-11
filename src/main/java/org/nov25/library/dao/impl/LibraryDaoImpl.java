package org.nov25.library.dao.impl;

import org.nov25.library.dao.LibraryDao;
import org.nov25.library.model.BorrowBook;

import java.sql.Date;

public class LibraryDaoImpl implements LibraryDao {
    @Override
    public int borrowBook(BorrowBook borrowBook) {
        return 0;
    }

    @Override
    public int returnBook(int borrowId, Date returnDate) {
        return 0;
    }
}
