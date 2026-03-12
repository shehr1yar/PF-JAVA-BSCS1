// Name : Shehriyar Farrukh
// Class : BSCS-1, Sec: A
// Roll Number: 52
// Form Number: 5675801

//Program to solve a set of linear equations simultaneously when its Augmented Matrix given as input. 

import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Number of variables: ");
        int n = s.nextInt();

        double[][] m = new double[n][n + 1];

        for (int i = 0; i < n; i++) {
            System.out.println("Equation " + (i + 1));
            for (int j = 0; j <= n; j++) {
                if (j == n) {
                    System.out.print("Constant: ");
                } else {
                    System.out.print("Coefficient a" + (i + 1) + (j + 1) + ": ");
                }
                m[i][j] = s.nextDouble();
            }
        }

        System.out.println("\nEquations:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "x" + (j + 1));
                if (j < n - 1) System.out.print(" + ");
            }
            System.out.println(" = " + m[i][n]);
        }

        for (int k = 0; k < n; k++) {
            for (int i = k + 1; i < n; i++) {
                double f = m[i][k] / m[k][k];
                for (int j = k; j <= n; j++) {
                    m[i][j] = m[i][j] - f * m[k][j];
                }
            }
        }

        double[] ans = new double[n];

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = m[i][n];
            for (int j = i + 1; j < n; j++) {
                ans[i] = ans[i] - m[i][j] * ans[j];
            }
            ans[i] = ans[i] / m[i][i];
        }

        System.out.println("\nAnswer:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + ans[i]);
        }

        s.close();
    }
}