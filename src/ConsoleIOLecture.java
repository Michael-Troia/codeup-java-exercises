import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String myName ="mike";
        System.out.printf("Hello %s\n", myName);//lowercase
        System.out.printf("Hello %S\n", myName);//uppercase

        int number = 4;
        String typeOfPet = "cats";
        System.out.printf("I have %d %s.", number, typeOfPet);

        double dollars = 10.12345;
        System.out.printf("starbucks costs $%.2f.\n",dollars);//go two decimal places

        //todo input
        Scanner sc = new Scanner(System.in);//"in" indicates we want input

        System.out.println("Plesse enter your full name.");
        String firstName = sc.next();
        String middleName = sc.next();
        String lastName = sc.next();
        System.out.printf("Hello, %s %s %s!\n", firstName, middleName, lastName);
        //will get input seperated by space or return
        //todo next() grabs the next string

        System.out.println("how old are you?");
        int age = sc.nextInt();
        System.out.printf("you are %s years old", age);
        //todo nextInt() grabs the next int

        System.out.println("favorite quote?\n");
        String quote = sc.nextLine();
        System.out.printf("wow \"%s\" is a great quote", quote);
        //todo nextLine() takes the whole next line (string)


    }
}
