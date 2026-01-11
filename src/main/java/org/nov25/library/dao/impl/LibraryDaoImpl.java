package org.nov25.library.dao.impl;

import org.nov25.library.dao.LibraryDao;
import org.nov25.library.model.BorrowBook;

import java.sql.Date;

public class LibraryDaoImpl implements LibraryDao {
    @Override
    public int borrowBook(BorrowBook borrowBook) {
        // insert borrow record
        // reduce available count in book table
        return 0;
    }

    @Override
    public int returnBook(int borrowId, Date returnDate) {

        // update returnDate
        // increase availableCount in book Table
        return 0;
    }
}
