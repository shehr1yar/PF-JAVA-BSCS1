// Name : Shehriyar Farrukh
// Class : BSCS-1, Sec: A
// Roll Number: 52
// Form Number: 5675801

import java.util.Scanner;

public class MagicSquareMatrix {
public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    System.out.print("Enter rows: ");
    int rowCount = kb.nextInt();

    System.out.print("Enter columns: ");
    int colCount = kb.nextInt();

    if (rowCount != colCount) {
        System.out.println("Not a square matrix. Program stopping.");
        return;
    }

    int[][] box = new int[rowCount][colCount];

    System.out.println("Enter matrix elements");

    for (int i = 0; i < rowCount; i++) {
        for (int j = 0; j < colCount; j++) {
            System.out.print("a" + (i + 1) + (j + 1) + ": ");
            box[i][j] = kb.nextInt();
        }
    }

    int expected = 0;
    for (int j = 0; j < colCount; j++) {
        expected += box[0][j];
    }

    boolean magic = true;

    for (int i = 1; i < rowCount; i++) {
        int rTotal = 0;
        for (int j = 0; j < colCount; j++) {
            rTotal += box[i][j];
        }
        if (rTotal != expected) {
            magic = false;
            break;
        }
    }

    if (magic) {
        for (int j = 0; j < colCount; j++) {
            int cTotal = 0;
            for (int i = 0; i < rowCount; i++) {
                cTotal += box[i][j];
            }
            if (cTotal != expected) {
                magic = false;
                break;
            }
        }
    }

    if (magic) {
        int d1 = 0;
        for (int i = 0; i < rowCount; i++) {
            d1 += box[i][i];
        }
        if (d1 != expected) magic = false;
    }

    if (magic) {
        int d2 = 0;
        for (int i = 0; i < rowCount; i++) {
            d2 += box[i][rowCount - 1 - i];
        }
        if (d2 != expected) magic = false;
    }

    if (magic) {
        System.out.println("\nMatrix:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(box[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Magic Square");
    } else {
        System.out.println("\nNot a Magic Square");
    }

    kb.close();
}
}