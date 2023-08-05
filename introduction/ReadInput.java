package introduction;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = sc.nextLine();

        System.out.println("Welcome " + name);


        // Reading Character
        System.out.print("Enter Your Great: ");
        char great = sc.next().charAt(0);
        System.out.println("Your great is " + great);

    }
}
