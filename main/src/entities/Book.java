package entities;

import entities.enums.BookStatus;

public class Book {
    private String name;
    private String author;
    private int pages;
    private double price;
    private BookStatus status;

    public Book(String name, String author, int pages, double value, BookStatus status) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = value;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getValue() {
        return price;
    }

    public void setValue(double value) {
        this.price = value;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}


