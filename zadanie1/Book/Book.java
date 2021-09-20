package com.company;
import java.lang.*;

public class Book {
    private String author;
    private int year;
    private int pages;

    public Book(String a, int y, int p) {
        author = a;
        year = y;
        pages = p;
    }

    public Book(String a) {
        author = a;
        year = 0;
        pages = 0;
    }

    public Book() {
        author = "Oscar Wilde";
        year = 0;
        pages = 0;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor(String author) {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "author: " + this.author + " , year " + this.year + " , pages " + this.pages;
    }
}

