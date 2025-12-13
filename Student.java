package CIE;
import java.util.Scanner;

public class Student {
    public String name;
    public String USN;
    public int sem;

    public void inputdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USN: ");
        USN = sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Semester: ");
        sem = sc.nextInt();
    }

    public void displaydetails() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}