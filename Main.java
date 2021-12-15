/*
* The "Hello Word!" program, just proves you can show print to terminal.
*
* @author  Darien R-H
* @version 1.0
* @since   2021-12-14
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Main {

    /**
    * 20kg per meter.
    */
    public static final float LOGWEIGHTPERMETER = 20;
    /**
    * Maximum weight per truck.
    */
    public static final float MAXLOADTRUCK = 1100;


    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final float logLength;
        final float totalLogs;

        // Block of code to try
        try {
          final Scanner userInput = new Scanner(System.in);
          System.out.print("Enter the length of the logs for this load: ");

          logLength = userInput.nextFloat(); //get length of log

          totalLogs = MAXLOADTRUCK / logLength / LOGWEIGHTPERMETER;

          System.out.println("Total number of logs this truck can carry = "
            + totalLogs);

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
                System.out.println("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}
