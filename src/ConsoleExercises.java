import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

//        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        System.out.println("Please enter an integer");
        //import scanner
        int prompt1 = sc.nextInt();
        System.out.printf("Number entered: %s\n", prompt1);
//              What happens if you input something that is not an integer?
//
//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter 3 words. Now.");
        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();
        System.out.printf("%s\n%s\n%s\n",w1,w2,w3);// there is a 4th keypress (return) after these 3 inputs
        sc.nextLine(); //this line scans the empty line caused by the 4th key press

//        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//              do you capture all the words?
//        4. Rewrite the above example using the nextLine method
        System.out.println("Enter a sentence");
        String prompt3 = sc.nextLine();
        System.out.printf("%s\n", prompt3);

//        Prompt the user to enter values of length and width of a classroom at Codeup.
        System.out.println("Enter the length of the classroom");
        int length = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the width");
        int width = Integer.parseInt(sc.nextLine());
//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
        int area = length * width;
        int perimeter = (2 * length)+(2* width);

//                Assume that the user will enter valid numeric data for length and width.
//        Display the area and perimeter of that classroom.
        System.out.printf("The area is: %d\n",area);
        System.out.printf("The perimeter is: %d\n",perimeter);
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.



    }
}
