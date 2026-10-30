import java.util.Scanner;

public class PatternGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Number Triangle");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        System.out.println();
        System.out.println("Size: " + n);

        if (choice == 1) {
            System.out.println("Pattern: Right Triangle");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            System.out.println("Pattern: Inverted Right Triangle");
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (choice == 3) {
            System.out.println("Pattern: Pyramid");
            for (int i = 1; i <= n; i++) {
                // сначала пробелы
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // потом звездочки
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (choice == 4) {
            System.out.println("Pattern: Inverted Pyramid");
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (choice == 5) {
            System.out.println("Pattern: Number Triangle");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Wrong choice!");
        }

        sc.close();
    }
}