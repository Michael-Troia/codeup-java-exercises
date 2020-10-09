package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input i1 = new Input(); //instance

        i1.yesNo();

        i1.getInt(1,10);

        i1.getDouble(1,1_000_000_000);

    }
}
