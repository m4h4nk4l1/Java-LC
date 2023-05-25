import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.println("king of summer fruits");
            case "apple" -> System.out.println("Kashmiri apple");
            case "orange" -> System.out.println("Orange rooba rooba");
            case "papaya" -> System.out.println("skin Brightening fruit");
            default -> System.out.println("Please Enter A Valid Fruit");
        }
    }
}
