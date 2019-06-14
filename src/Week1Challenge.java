/*
 * This program will show the number and indicate whether or not it is prime.
 * Option 1:
 *    The user will have to input a number, and you will display that number.
 *    You will check if that number is prime and indicate that to the user.
 *
 */

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

    public static void main(String[] args){
        Boolean priNo;
        int userNo = 0;
        String msg = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an inter: ");
        userNo = keyboard.nextInt();

        // Check if given number is a prime number
        priNo = ckPrime(userNo);

        if (priNo)
            msg = "is";
        else
            msg = "is not";

        System.out.printf("%d %s a prime number.", userNo, msg);
    }

}
