package CIE;
import java.util.Scanner;

public class Internal extends Student {
    public int internalmarks[] = new int[5];

    public void CIEmarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter internal marks for subject " + (i+1));
            internalmarks[i] = sc.nextInt();
        }
    }
}