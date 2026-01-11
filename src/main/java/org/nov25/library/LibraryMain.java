package org.nov25.library;

import org.nov25.library.dao.BookDao;
import org.nov25.library.dao.MemberDao;
import org.nov25.library.dao.impl.BookDaoImpl;
import org.nov25.library.dao.impl.MemberDaoImpl;
import org.nov25.library.model.Book;
import org.nov25.library.model.Member;

public class LibraryMain {

    public static void main(String[] args){

        // To test book insert
        BookDao bookDao = new BookDaoImpl();
        Book b1 = new Book("Java Book","Jane",2);
        bookDao.addBook(b1);

        MemberDao memberDao = new MemberDaoImpl();
        Member m1 = new Member("Hein Htet","hein@gmail.com");
        memberDao.addMember(m1);
        // Get List
        for (Member member : memberDao.getMemberList()) {
            
        }

    }
}
