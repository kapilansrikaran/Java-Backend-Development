package introduction;

public class JavaTypecastingExample {
    public static void main(String[] args) {
        /*
            There are two type
                1. Widening Typecasting (Automatically done by Java)
                    Small datatype to Large datatype
                2. Explicitly Typecasting (User defined)
                    Large datatype to small datatype
                    Note: Be aware of Lossy conversion when it is in the Explicitly Typecasting
         */

        // Widening Typecasting
        short s = 12345;
        int i = s;
        System.out.println(i);

        // Explicitly Typecasting
        long l = 45000650L;
        int I = (int)l;
        System.out.println(I);


    }
}
