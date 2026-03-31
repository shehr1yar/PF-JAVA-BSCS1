// Name : Shehriyar Farrukh
// Class : BSCS-1, Sec: A
// Roll Number: 52
// Form Number: 5675801

//Part (b) Write user defined Java functions to carry out calculation as mentioned in Part (a). This function should take an integer number as parameter, calculates its binary representation, stores it in an integer array and returns that array of integers (that contains its binary digits) as return value

import java.util.Scanner;

public class DecimalToBinaryC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        int number = sc.nextInt();

        String ans = toBinary(number);

        System.out.println("Binary value = " + ans);

        sc.close();
    }

    public static String toBinary(int x) {

        String s = "";

        if (x == 0) return "0";

        while (x > 0) {
            int r = x % 2;
            s = r + s;
            x = x / 2;
        }

        return s;
    }
}