package entities;

public class Book {
    private String name;
    private String description;
    private Author author;
    private int pages;
    private double value;

    public Book(){
    }

    public Book(String name, String description, Author author, int pages, double value) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.pages = pages;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

