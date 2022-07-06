package application; // problema do beecrowd: primary arithmetic

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secNumber = scanner.nextInt();
        String firstString = Integer.toString(firstNumber);
        String secString = Integer.toString(secNumber);

        do {
            int numberOperations = 0;
            int n = Math.min(firstString.length(), secString.length());

            for (int i = n - 1; i >= 0; i--) {
                Integer x = Integer.parseInt(String.valueOf(firstString.charAt(i)));
                Integer y = Integer.parseInt(String.valueOf(secString.charAt(i)));
                if (x + y > 9) {
                    numberOperations++;
                }
            }

            if (numberOperations == 0) {
                System.out.println("No carry operations.");
            } else {
                System.out.printf("%d carry operations.%n", numberOperations);
            }

            firstNumber = scanner.nextInt();
            secNumber = scanner.nextInt();
            firstString = Integer.toString(firstNumber);
            secString = Integer.toString(secNumber);

        } while (firstNumber != 0 && secNumber != 0);

        scanner.close();
    }
}
