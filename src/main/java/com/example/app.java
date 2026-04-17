import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    books.add(new Book(id, name));
                    System.out.println("Book Added!");
                    break;

                case 2:
                    System.out.println("Available Books:");
                    for (Book b : books) {
                        System.out.println(b.id + " - " + b.name);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to delete: ");
                    int delId = sc.nextInt();
                    books.removeIf(b -> b.id == delId);
                    System.out.println("Book Deleted!");
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}