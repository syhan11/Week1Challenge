/*
 * This program will show the number and indicate whether or not it is prime.
 * Option 1:
 *    The user will have to input a number, and you will display that number.
 *    You will check if that number is prime and indicate that to the user.
 *
 * Option 2:
 *    The system will generate a random number between 1 and 250.
 *    Then it will check if that number is prime and indicate that to the user.
 */

import java.util.Random;
import java.util.Scanner;

public class Week1Challenge {

    /*
     * This method wil return true if the number is prime number.
     * Otherwise it will return false.
     */

    public static Boolean ckPrime(int numb){
        int retVal = 0, isPrime = 0, tmpVal = 0;

        for (int i = 1; i <= numb; i++){
            tmpVal = numb % i;

            if (tmpVal == 0)
                isPrime++;
        }

        if (isPrime == 2)
            return (true);
        else
            return (false);

    }

    public static void printPrime(int fromNo, int toNo){
        Boolean checkPrim;
        String msg = "";

        for (int i = fromNo; i <= toNo; i++) {

            // Check if given number is a prime number
            checkPrim = ckPrime(i+1);
            if (checkPrim)
                msg = "is";
            else
                msg = "is not";

            System.out.printf("%d %s a prime number.\n", i, msg);
        }
    }

    public static void main(String[] args){
        String userA = "", msg = "";
        Boolean priNo;
        int userNo = 0, maxNo = 250;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Would you like to generate a random number (Y/N)? ");
        userA = keyboard.next();

        // Check user's option
        if ((userA.compareTo("y") == 0) || (userA.compareTo("Y") == 0)) {
            // generate a random number
            System.out.println("Generating a random number...");

            Random tmp = new Random();
            userNo = tmp.nextInt(maxNo)+1;
        }
        else {
            // get a number from the user
            System.out.print("Please enter an inter: ");
            userNo = keyboard.nextInt();
        }

        /*
         * This will print out if a number is a prime number or not
         * from 1 to either user specified or randomly generated number.
         */
        printPrime(1, userNo);
    }
}
