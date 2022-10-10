/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Book book;
    private Reader reader;
    private Date takeOnBook;
    private Date returnBook;

    public History(Book book, Reader reader, Date takeOnBook, Date returnBook) {
        this.book = book;
        this.reader = reader;
        this.takeOnBook = takeOnBook;
        this.returnBook = returnBook;
    }

    public Date getReturnBook() {
        return returnBook;
    }

    public void setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getTakeOnBook() {
        return takeOnBook;
    }

    public void setTakeOnBook(Date takeOnBook) {
        this.takeOnBook = takeOnBook;
    }

    @Override
    public String toString() {
        return "History{" + "book=" + book + ", reader=" + reader + ", takeOnBook=" + takeOnBook + ", returnBook=" + returnBook + '}';
    }
    
}
