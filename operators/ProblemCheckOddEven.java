package operators;

import java.util.Scanner;

public class ProblemCheckOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

    }
}
