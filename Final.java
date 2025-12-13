import SEE.Externals;
import java.util.Scanner;

public class Final{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();

        Externals see[] = new Externals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i+1));

            see[i] = new Externals();

            see[i].inputdetails();   
            see[i].CIEmarks();       
            see[i].SEEmarks();       
            see[i].Totalmarks();     
        }

        System.out.println("Final marks of students ");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1));
            see[i].displaydetails();

            System.out.println("Final marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j+1) + ": " + see[i].finalmarks[j]);
            }
        }
    }
}