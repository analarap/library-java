package entities;

public class Client {
    private String name;
    private String cpf;
    private Book book;

    public Client(){
    }

    public Client(String name, String cpf, Book book) {
        this.name = name;
        this.cpf = cpf;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
