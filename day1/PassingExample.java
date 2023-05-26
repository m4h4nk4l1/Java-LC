package day1;

public class PassingExample {
    public static void main(String[] args) {
        String chacha = "Iron Man";
        greet(chacha);
    }

    static void greet(String naam) {
        naam = "Captain America";
        System.out.println(naam);
    }
}
