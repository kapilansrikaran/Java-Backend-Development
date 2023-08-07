package operators;

public class LogicalANDExample {
    public static void main(String[] args) {
        int age = 25;
        String citizenship = "SriLankan";

        /* Logical AND - &
        if(age >= 21 & citizenship == "SriLankan")
            System.out.println("Person may vote");
        else
            System.out.println("Person cannot vote");
        */

        // Logical Short Circuit AND - &&
        // Means check first condition, If it is Fault? then didn't check next condition
        if(age >= 21 && citizenship == "SriLankan")
            System.out.println("Person may vote");
        else
            System.out.println("Person cannot vote");
    }
}
