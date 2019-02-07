/**
 * <p>Simple Bruteforce Primality Test.
 * This class is named Sieve as I had originally
 * planned to implement the Sieve of Eratosthenes, however
 * ran into trouble due to Java's limited memory allocation and
 * inability to handle large arrays.</p>
 *
 * @author James Harbour
 * @version 7/2/19
 * @uses java.util.ArrayList
 */

import java.util.ArrayList;

public class Sieve {
    private int low, high;
    private ArrayList<Num> primes;
    private int numPrimes;

    public Sieve(int low, int high) {
        this.low = low;
        this.high = high;
        this.numPrimes = 0;
        this.primes = new ArrayList<Num>();

        for(int i = low; i <= high; i++) {
            this.primes.add(new Num(i));
        }

        //Iterate over ArrayList and set primality values
        //by repeatedly calling isPrime method on the tempNum;
        Num tempNum;
        for(int i = 0; i < this.primes.size(); i++) {
            tempNum = this.primes.get(i);
            isPrime(tempNum);
        }
    }


    // Tests the amount of primes up to n.
    /*
    *
    * For a Num object the method tests the Num.value's
    * divisibility for each number j = 2 up to j <= sqrt(Num.value).
    * Initially assumes that the number is prime, and if there is a
    * number tested that divides i, then it knows that the number is not prime.
    * This comes from the fact that no number has factors larger
    * than its square root.
    *
    * */
    public static boolean isPrime(Num n) {
        boolean isP = true;
        for(int j = 2; j <= Math.sqrt(n.getValue()); j++) {
            if(n.getValue() % j == 0) {
                isP = false;
            }
        }


        //Cases for numbers 1 and 2
        if(n.getValue() == 2) {
            isP = true;
        }
        if(n.getValue() == 1) {
            isP = false;
        }

        n.setPrimality(isP);
        return isP;
    }

    //Output all the numbers in the Num ArrayList with primality of true
    public void printOutput() {
        for(Num n : this.primes) {
            if(n.getPrimality()) {
                System.out.printf("%d, ", n.getValue());
                this.numPrimes++;
                if(this.numPrimes % 10 == 0) {
                    System.out.println();
                }
            }

        }
        System.out.println("\n\nNumber of Primes in Interval is " + this.numPrimes);
    }




}
