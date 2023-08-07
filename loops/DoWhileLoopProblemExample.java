/*
Sum of Positive number
Given a stream of numbers, read
the numbers till you read a -ve(negative) integer and print their sum of numbers read so far
 */

package loops;

import java.util.Scanner;

public class DoWhileLoopProblemExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;

        do{
            num = scan.nextInt();
            sum = sum+num;
        }while(num>=0);

        System.out.println(sum);

    }
}
