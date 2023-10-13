package com.store.bookshelf.entity;

public class Books {

    private String author;

    private String bookName;
    private int yearOfPublish;

    public Books(){
        super();
    }
    public Books(String author, String bookName, int yearOfPublish){
        this.author = author;
        this.bookName = bookName;
        this.yearOfPublish = yearOfPublish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}
