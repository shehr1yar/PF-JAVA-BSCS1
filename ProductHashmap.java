// Name : Shehriyar Farrukh
// Class : BSCS-1, Sec: A
// Roll Number: 52
// Form Number: 5675801
// Seat No: EB26210006104

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductHashmap {
    public static void main(String[] args) {

        Map<String, Integer> productTotals = new HashMap<>();

        try {
            File file = new File("productfile.txt");
            System.out.println("Reading: " + file.getAbsolutePath());

            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()) scanner.nextLine();

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                System.out.println("LINE -> " + line);

                String[] parts = line.trim().split("\\s+");

                if (parts.length >= 9) {

                    String product = parts[7];
                    int amount = Integer.parseInt(parts[8]);

                    productTotals.put(product,
                        productTotals.getOrDefault(product, 0) + amount);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println("\nTotal Amount per Product:");

        if (productTotals.isEmpty()) {
            System.out.println("No data found");
        }

        for (String key : productTotals.keySet()) {
            System.out.println(key + ": " + productTotals.get(key));
        }
    }
}
