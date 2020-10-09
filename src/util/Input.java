package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input (){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
//        System.out.println("Enter a string");
        return this.sc.next();
    }

    public boolean yesNo(){
        System.out.println("y/n?\n");
        String checker = getString();
        System.out.println(checker.equalsIgnoreCase("y"));
        return (checker.equalsIgnoreCase("y"));
    }


    public int getInt(int min, int max){
        while (true){
            System.out.printf("Enter an integer between %d, and %d\n", min, max);
            int magicNumber = this.getInt();
            if (magicNumber >= min && magicNumber <= max) {
                System.out.println("You did it!\n");
                return magicNumber;
            }
        }
    }

    public int getInt(){
        return sc.nextInt();
    }

    public double getDouble(){
        return sc.nextDouble();
    }


    public double getDouble(double min, double max){
        while (true){
            System.out.printf("Enter a double between %f, and %f\n", min, max);
            double magicDouble = this.getDouble();

            if (magicDouble > min && magicDouble < max){
                System.out.println("You did it!\n");
                return magicDouble;
            }
        }
    }
}
