import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter your name: ");

        // Read in line from standard input
        String name = in.nextLine();

        System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        double startNum = in.nextDouble(); // Reads in an Double from standard input
        in.nextLine();
        
        System.out.print("Please enter the end value: ");
        double endNum = in.nextDouble();

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");

        double sum = 0;
        double i = 1;
        while (i <= endNum) {
            sum += i * i;
            i++;
        }

         System.out.println(sum/((endNum - startNum)+1)); // will print all numbers if inside loop
        }
    }