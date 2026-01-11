package org.nov25.library.model;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(){

    }
    public Book(String title,String author, int available_copies){
        this.title = title;
        this.author = author;
        this.available_copies = available_copies;
    }

    public Book(int id,String title,String author, int available_copies){
        this.id = id;
        this.title = title;
        this.author = author;
        this.available_copies = available_copies;
    }
    public int getAvailable_copies() {
        return available_copies;
    }

    public void setAvailable_copies(int available_copies) {
        this.available_copies = available_copies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int available_copies;
}
