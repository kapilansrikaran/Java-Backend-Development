/*
Given an integer N, i.e. the size of the input, followed by N more integers,
find the largest of these N Numbers.
*/

package loops;

import java.util.Scanner;

public class ForLoopProblemExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the input number size: ");
        int n = scan.nextInt();

        int maxValue = Integer.MIN_VALUE;


        System.out.println("Enter the " + n + " Numbers");
        for (int i = 0; i < n; i++) {
            int currentValue = scan.nextInt();
            maxValue = Math.max(maxValue, currentValue);
//             if(maxValue<currentValue){
//                 maxValue = currentValue;
//             }

        }
        System.out.println(maxValue);

    }
}
