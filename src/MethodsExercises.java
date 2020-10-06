import java.util.Scanner;

public class MethodsExercises {
Scanner sc = new Scanner(System.in);
//#1
    public static double adding(int add1, int add2) {
        return add1 + add2;
    }
    public static double subtracting(int minus1, int minus2) {
        return minus1 - minus2;
    }
    public static double multiplying(int times1, int times2) {
        if (times1 == 0 || times2 == 0) {
            return 0;
        } else if (times2 == 1) {
            return times1;
        } else {
            return times1 += multiplying(times1, times2 - 1);
        }
    }
    public static double dividing(int div1, int div2) {
        return div1 / div2;
    }
    public static double modulus(int mod1, int mod2) {
        return mod1 % mod2;
    }

//#2
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int check = sc.nextInt();
        if (check >= min & check <= max) {
            System.out.println("Yay!");
        } else {
            System.out.println("boooooo");
            return getInteger(min, max);
        }
        return check;
    }

//#3
    public static long factorial(int num) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        int i = 1;

        while (i <= num) {
            if (i < num) {
                System.out.printf("%d * ", i);
            } else if (i == num) {
                System.out.printf("%d = ", i);
            }
            System.out.println((result *= (i++)));
        }
        return result;
    }

//#4
    public static void random(int sides) {
        System.out.println(Math.floor(Math.random() * sides) + 1);
        System.out.println(Math.floor(Math.random() * sides) + 1);
    }

    public static void diceRoll(Scanner sc) {
        while (true) {
            System.out.println("How many sides?");
            int sides = sc.nextInt();
            random(sides);
            System.out.println("Continue? y/n");
            if (sc.next().equals("n")){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//#1
// Basic Arithmetic
//        todo Create four separate methods. Each will perform an arithmetic operation:
//          Addition
//          Subtraction
//          Multiplication
//          Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//                Test your methods and verify the output.
//        Add a modulus method that finds the modulus of two numbers.
//                Food for thought: What happens if we try to divide by zero? What should happen?
//                Bonus
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

        System.out.println("adding 3 and 3 ... " + adding(3,3));
        System.out.println("Subtracting 3 and 3 ... " + subtracting(3,3));
        System.out.println("Multiplying 3 and 3 ... " + multiplying(3,3));
        System.out.println("Dividing 3 and 3 ... " + dividing(3,3));
        System.out.println("The remainder of 12 divided by 3 ... " + modulus(12,3));

//#2
//        Create a method that validates that user input is in a certain range
//        The method signature should look like this:
//        public static int getInteger(int min, int max);
//        and is used like this:
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//                Hint: recursion might be helpful here!

        getInteger(1,10);

//#3
//Calculate the factorial of a number.
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:
//
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//Bonus
//
//Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//Use recursion to implement the factorial.

    while(true){
        factorial(getInteger(1,10));
        System.out.println("Continue? y/n");
        String ans = sc.next();
        if (ans.equals("n")) {
            break;
        }
    }

//#4
//Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.

        diceRoll(sc);
    }
}

