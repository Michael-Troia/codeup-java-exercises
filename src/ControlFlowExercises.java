import java.util.Scanner;
import java.util.stream.IntStream;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf(" %d ", i);
//            i++;
//        }
//
//        int a = 0;
//        do {
//            System.out.printf("a is %d", a);
//            a += 2;
//        } while (a <= 100);
//
//        int b = 100;
//        do {
//            System.out.printf("b is %d", b);
//            b -= 5;
//        } while (b >= -10);

//        int c = 2;
//        do {
//            System.out.printf("c is %d", c);
//            c = c * c;
//            if (c == 0){
//                break;
//            }
//        } while (c <= 1000000);

//        for (int c = 2; c <= 1000000; c *= c) {
//            System.out.println(c);
//            if (c == 0) {
//                break;
//            }
//        }

//        todo Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 101; i++){
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            }
//        }

//        todo Prompt the user to enter an integer.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int powersOf = sc.nextInt();
////        Display a table of squares and cubes from 1 to the value entered.
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= powersOf; i++) {
//            System.out.printf("%-6d | %-7d | %-6d\n", i, (i * i), (i * i * i));
//            if (i == powersOf) {
//                System.out.println("Continue? [y/n]");
//                String cont = sc.next();
//                boolean confirmation = cont.equals("y");
//                if (confirmation) {
//                    System.out.println("To which integer?");
//                    powersOf = sc.nextInt();
//                    continue;
//                } else break;
//            }
//        }
//        Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.

//        Display the corresponding letter grade.
//        boolean continuing = true;
//        do {
//            System.out.println("Enter your numerical grade");
//            int grade = sc.nextInt();
//        if (grade <= 59) {
//            System.out.println("F");
//        } else if (grade <= 66) {
//            System.out.println("D");
//        } else if (grade <= 79) {
//            System.out.println("C");
//        } else if (grade <= 87) {
//            System.out.println("B");
//        } else if (grade <= 100) {
//            System.out.println("A");
//        } else System.out.println("Sure you did bud.");
//        System.out.println("continue? [y/n]");
//        String cont2 = sc.next();
//        continuing = cont2.equals("y");
//        } while (continuing == true);


//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
    }
}