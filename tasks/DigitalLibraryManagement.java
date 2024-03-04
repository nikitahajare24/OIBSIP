package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println("--------------------");
        }
    }
}

class AdminModule {
    private Library library;

    public AdminModule(Library library) {
        this.library = library;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();
        System.out.print("Enter the year of publication: ");
        int year = scanner.nextInt();

        Book book = new Book(title, author, year);
        library.addBook(book);

        System.out.println("Book added successfully!");
    }
}

class UserModule {
    private Library library;

    public UserModule(Library library) {
        this.library = library;
    }

    public void displayBooks() {
        library.displayBooks();
    }
}

public class DigitalLibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        AdminModule adminModule = new AdminModule(library);
        UserModule userModule = new UserModule(library);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Admin Module");
            System.out.println("2. User Module");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    adminModule.addBook();
                    break;
                case 2:
                    userModule.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
       
    }
    
}