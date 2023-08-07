/*
Random Game
write a program to generate random numbers between [1,10] and print them to the output
terminate when you get 5
 */
package loops;

public class RandomGameProblem {
    public static void main(String[] args) {
        while(true){
            int num = (int) (Math.random()*10 +1);
            if (num == 5)
                break;
            // Skip all multiples of 4
            if (num % 4 ==0){
                continue;
            }
            System.out.print(num + "\t");
        }

    }
}
