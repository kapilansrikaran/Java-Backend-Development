package operators;

public class LogicalORExample {
    public static void main(String[] args) {
        String subject = "AL";

//        Logical OR

//        if(subject == "AL" | subject =="OL"){
//            System.out.println("Permitted");
//        }
//        else {
//            System.out.println("Not permitted");
//        }



//        Logical Short Circuit OR
        if(subject == "AL" || subject =="OL"){
            System.out.println("Permitted");
        }
        else {
            System.out.println("Not permitted");
        }
    }
}
