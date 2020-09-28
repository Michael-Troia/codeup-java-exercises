public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World");

        //notes

//        Type	Bytes1	Description
//        byte	1	Very short integers from -128 to 127
//        short	2	Short integers from -32,768 to 32,767//variables
//        int	4	Integers from -2,147,483,648 to 2,147,483,647    //declaring separate from initialization
//        long	8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
//        double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits    System.out.println(seven);
//        char	2	A single Unicode character that’s stored in two bytes
//        boolean	1	A true or false value    //declare and initializing
//        int eight = 8;
//
//        //constants, final
//            final int SIDES_OF_A_DICE = 6;
//            final String API_KEY = "b75b703d8195f6f433ca";
//            final String GITHUB_API_BASE_URL = "https://api.github.com";
//            //final acts just like const in js
//        //casting - going from one data type to another
//            //implicit - less precise to more precise (widening)
//                float num1 = 2.22F;
//                double num2 = num1;
//                System.out.println(num2);
//            //explicit - more precise to less precise (narrow)
//                double num3 = 3.1;
//                float num4 = (float) num3;
//                System.out.println(num4);
        int myFavoriteNumber = 17;
        String myString = "something";
        float myNumber = 3.14F;



        //difference between
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //and
//        int three = (int) "three";

        //rewrite using shorthand
//            int x = 4;
//            x = x + 5
//            x += 5;

//            int x = 3;
//            int y = 4;
//            y = y * x
//            y *= x;

//            int x = 10;
//            int y = 2;
//            x = x / y;
//            y = y - x
//            x /= y;
//            y -= x;

    }
}