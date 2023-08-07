package operators;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();

        if(num > 1){
            System.out.println(num + " is positive number");
        } else if (num < 0) {
            System.out.println(num + " is negative number");
        }else {
            System.out.println("Value is zero");
        }

    }
}
