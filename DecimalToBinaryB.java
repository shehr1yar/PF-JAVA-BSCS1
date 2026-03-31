// Name : Shehriyar Farrukh
// Class : BSCS-1, Sec: A
// Roll Number: 52
// Form Number: 5675801

//Part (b) Write user defined Java functions to carry out calculation as mentioned in Part (a). This function should take an integer number as parameter, calculates its binary representation, stores it in an integer array and returns that array of integers (that contains its binary digits) as return value

import java.util.Scanner;

public class DecimalToBinaryB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        int val = in.nextInt();

        int out[] = makeBin(val);

        System.out.print("Binary: ");
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }

        in.close();
    }

    public static int[] makeBin(int num) {

        int store[] = new int[40];
        int c = 0;

        while (num > 0) {
            store[c] = num % 2;
            num = num / 2;
            c++;
        }

        int finalArr[] = new int[c];

        for (int i = 0; i < c; i++) {
            finalArr[i] = store[c - i - 1];
        }

        return finalArr;
    }
}