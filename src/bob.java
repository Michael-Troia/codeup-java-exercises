import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("What?");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
                break;
            }
        }
    }
}
