import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;

        // Input validation loop
        while (true) {
            System.out.print("Enter the size: ");
            size = in.nextInt();

            if (size < 1) {
                System.out.println("too small!");
            }
            else if (size > 5) {
                System.out.println("too big!");
            }
            else {
                break; // number is valid exit loop
            }
        }
        int total = 2 * size; // total number of rows + cols

        // print pattern
        for (int row = 1; row <= total; row++) {
            int base = (row <= size) ? row : (2 * size - row + 1);

            // first half increasing
            for (int col = 0; col < size; col++) {
                System.out.print(base + col);
            }
            // second half decreasing
            for (int col = size - 1; col >= 0; col--) {
                System.out.print(base + col);
            }

            System.out.println();
        }
    }
}