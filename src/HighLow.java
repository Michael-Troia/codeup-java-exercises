import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int magicNumber = (int) (Math.floor(Math.random() * 100) + 1);
            System.out.println("don't look" + magicNumber);
        while (true) {
            System.out.println("Guess a number from 1 to 100");
            int guess = sc.nextInt();

            if (guess < magicNumber) {
                System.out.println("Go higher!");
            } else if (guess > magicNumber) {
                System.out.println("Go higher!");
            } else {
                System.out.println("yay!");
                break;
            }
        }
    }
}
