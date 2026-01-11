package org.nov25.library.model;

import java.util.Date;

public class BorrowBook {

    private int bookId;
    private int memberId;
    private Date borrowDate;

    public BorrowBook(){

    }

    public BorrowBook(int bookId,int memberId, Date borrowDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
}
