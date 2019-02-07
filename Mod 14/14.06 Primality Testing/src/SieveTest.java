/**
 * <p>Client class for Sieve object. Allows
 * user-defined interval for prime testing.</p>
 *
 * @author James Harbour
 * @version 7/2/19
 * @uses java.util.Scanner
 */

import java.util.Scanner;
public class SieveTest {

    public static void main(String[] args) {
        //Create Scanner object for user input
        Scanner in = new Scanner(System.in);

        //Get User Input for Interval Bounds
        System.out.print("Low: ");
        int l = in.nextInt();
        System.out.print("High: ");
        int h = in.nextInt();

        //Create a Sieve object with specified user bounds
        Sieve sieve = new Sieve(l, h);


        //Output Primes and primeCount
        System.out.println("The primes within the interval you specified are:");
        sieve.printOutput();
        System.out.println();
    }

}
