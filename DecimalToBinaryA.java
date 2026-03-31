// Name : Shehriyar Farrukh
// Class : BSCS-1, Sec: A
// Roll Number: 52
// Form Number: 5675801

//Part (a) Write Java program that takes input an integer number and converts it into a binary number

import java.util.Scanner;

public class DecimalToBinaryA {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = x.nextInt();

        int arr[] = new int[50];
        int k = 0;

        if (n == 0) {
            System.out.println("Binary: 0");
        } else {
            while (n != 0) {
                arr[k] = n % 2;
                n = n / 2;
                k++;
            }

            System.out.print("Binary form: ");
            for (int i = k - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        }

        x.close();
    }
}