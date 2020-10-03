import java.util.Scanner;

public class MethodsExercises {

//#1
/*    public static double adding(int add1, int add2) {
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
    }*/

//#2
/*    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);

        int check = sc.nextInt();
        if (check >= min & check <= max) {
            System.out.println("Yay!");
        } else {
            System.out.println("Enter a number between 1 and 10");
            return getInteger(min, max);
        }
        return 7;
    }*/

//#3
    public static int factorial(int num) {
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
        System.out.println("Continue? y/n");
        boolean yes = sc.next().equals("y");
        if (yes == true){
            System.out.println("hi");
        } else {
            System.out.println("bye");
        }
        System.out.println("Enter a number from 1 to 10");
        int factorialNum = sc.nextInt();
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//#1
/*       Basic Arithmetic
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
        System.out.println("The remainder of 12 divided by 3 ... " + modulus(12,3)); */

//#2
/*
        System.out.println("Enter a number between 1 and 10");
        int userInput = getInteger(1,10);

//        Create a method that validates that user input is in a certain range
//        The method signature should look like this:
//        public static int getInteger(int min, int max);
//        and is used like this:
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//                Hint: recursion might be helpful here!*/

//#3
    /*Calculate the factorial of a number.
Prompt the user to enter an integer from 1 to 10.
Display the factorial of the number entered by the user.
Ask if the user wants to continue.
Use a for loop to calculate the factorial.
Assume that the user will enter an integer, but verify it’s between 1 and 10.
Use the long type to store the factorial.
Continue only if the user agrees to.
A factorial is a number multiplied by each of the numbers before it.
Factorials are denoted by the exclamation point (n!). Ex:

1! = 1               = 1
2! = 1 x 2           = 2
3! = 1 x 2 x 3       = 6
4! = 1 x 2 x 3 x 4   = 24
Bonus

Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//Use recursion to implement the factorial.*/

        System.out.println("Enter a number from 1 to 10");
        int factorialNum = sc.nextInt();
        System.out.println(factorial(factorialNum));
    }
}
