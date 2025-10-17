import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }
}

public class lab3{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;

        System.out.print("Enter number of books: ");
        n = s.nextInt();
        s.nextLine(); // consume newline

        Books b[];
        b = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1) + ":");
            System.out.print("Enter Book name: ");
            name = s.nextLine();
            System.out.print("Enter Author name: ");
            author = s.nextLine();
            System.out.print("Enter Price: ");
            price = s.nextInt();
            System.out.print("Enter Number of pages: ");
            numPages = s.nextInt();
            s.nextLine(); // consume newline
            b[i] = new Books(name, author, price, numPages);
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + " Details:");
            System.out.println(b[i].toString());
        }
        s.close();
    }
}