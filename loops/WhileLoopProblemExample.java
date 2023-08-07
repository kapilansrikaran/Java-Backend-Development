/*
Given an integer N, count and print its number of digit
*/

package loops;

import java.util.Scanner;

public class WhileLoopProblemExample {
    public static void main(String[] args) {

        // Count Digits of a Number
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int digits =0;

        while(num>0){
            num = num/10;
            digits++;
        }

        System.out.println(digits);

    }
}
