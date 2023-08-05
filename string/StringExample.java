package string;

public class StringExample {
    public static void main(String[] args) {

        String name = "Kapilan";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

        // Multi Line String use to store paragraph or long String
        String anime = """
                That Time I Got Reincarnated As A Slime,
                Demon Slayer,
                Dragon Ball Z,
                One-Punch Man,Mob Psycho 100
                """;
        System.out.println(anime);
        System.out.println(anime.length());
        System.out.println(anime.charAt(39));


    }
}
