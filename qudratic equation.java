import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter coefficient a:");
        double a = sc.nextDouble();
        
        
        if (a == 0) {
            System.out.println("Not a quadratic equation");
            return;
        }
        
        System.out.println("Enter coefficient b:");
        double b = sc.nextDouble();
        
        System.out.println("Enter coefficient c:");
        double c = sc.nextDouble();
        
        
        double d = (b * b) - (4 * a * c);
        
       
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = " + r1 + " Root 2 = " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1 = Root 2 = " + r);
        } else {
            System.out.println("No real solutions (roots are imaginary)");
        }
        
        sc.close();
    }
}