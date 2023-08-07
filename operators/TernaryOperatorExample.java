package operators;

import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {

        //result = (condition)? expression 1 : expression 2 ;

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String ans = (num % 2 ==0)? "Even": "Odd";
        System.out.println(ans);
    }
}
