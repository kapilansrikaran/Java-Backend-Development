package introduction;

import java.util.Scanner;


public class ProblemSimpleInterestCalculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int P = sc.nextInt();

        System.out.print("Enter Rate: ");
        int R = sc.nextInt();

        System.out.print("Enter Interest: ");
        int T = sc.nextInt();

        int SI = P*R*T/100;
        System.out.println("Simple Interest is " + SI);


    }
}
