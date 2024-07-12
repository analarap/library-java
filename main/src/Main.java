import entities.Book;
import entities.enums.BookStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        int opcao;
        String name;
        String author;
        int pages;
        double price;
        BookStatus status;

        System.out.println("Welcome to Aurora Library :)\n####################################");
        System.out.println("So, let's start? ");

        System.out.println("1. Add a new book to library" +
                "\n2. Remove a book of the library" +
                "\n3. See the books that is unavaible in the library" +
                "\n4. See the books that was already gone of the library" +
                "\n5. Exit the system :(");
        opcao = sc.nextInt();

        sc.nextLine();

        switch (opcao){
            case 1:
                System.out.println("#############################\n" +
                        "Enter book's data: ");

                System.out.print("\nName: ");
                name = sc.nextLine();

                System.out.print("\nAuthor: ");
                author = sc.nextLine();

                System.out.print("\nPages: ");
                pages = sc.nextInt();

                System.out.print("\nPrice: ");
                price = sc.nextDouble();

                sc.nextLine();

                System.out.print("\nStatus: ");
                String statusStr = sc.nextLine();

                if (statusStr.equals("AVALIABLE") || statusStr.equals("UNAVALIABLE")) {
                    status = BookStatus.valueOf(statusStr.toUpperCase());

                    Book newBook = new Book(name, author, pages, price, status);
                    books.add(newBook);
                    System.out.println("Book added successfully!");
                    System.out.println(books);

                } else {
                    System.out.println("This status do not exist! Try again :/");
                }

                break;

            case 5:
                System.out.println("Exiting the system...");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
                break;

        }



        sc.close();
    }
}