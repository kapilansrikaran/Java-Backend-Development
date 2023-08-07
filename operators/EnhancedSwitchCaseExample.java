/*
Given a lowercase character, state whether It is a vowel or a consonant.
*/

package operators;

import java.util.Scanner;

public class EnhancedSwitchCaseExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char letter = scan.next().charAt(0);

        /* Method 1
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
            default:
                System.out.println("Consonant");
        }
      */

        switch (letter){
            case 'a','e','i','o','u' -> {
                System.out.println("Vowel");
            }
            default -> {
                System.out.println("Consonant");
            }

        }


    }
}
