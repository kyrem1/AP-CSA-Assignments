
/**
 * Client Class for the Encryption and Decryption Objects
 *
 * 
 * @author James Harbour
 * @version 2/6/19
 */
import java.util.Scanner;
public class CaesarTester
{
    
    public static void main(String[] args) {
        //Create Instances of Scanner
        //First one has delimiter as whitespace, and second has new line as delimiter
        Scanner in = new Scanner(System.in);
        Scanner inLine = new Scanner(System.in);
        inLine.useDelimiter("\\n");
        
        //User input for shift
        System.out.print("Input a shift key value from 0–25: ");
        int s = in.nextInt();
        
        //Ensure Input is valid
        while(s < 0 || s > 25) {
            System.out.print("Please input a shift key value from 0–25: ");
            s = in.nextInt();
        }


        //System.out.println(Encryption.cipherAlphabet(s));     //Debug

        //Display the alphabet and cipher alphabet.
        System.out.printf("%18s %26s\n", "ORIGINAL ALPHABET:", Encryption.ALPHABET);
        System.out.printf("%18s %26s\n\n", "CIPHER ALPHABET:", Encryption.cipherAlphabet(s));

        //Options Menu
        System.out.println("Enter the number corresponding to what you would like to do");
        System.out.println("\t1. Encryption");
        System.out.println("\t2. Decryption");
        System.out.println("\t3. Exit\n");

        //Continuous User Input
        boolean userFinished = false;
        while(!userFinished) {
            System.out.print("What would you like to do: ");
            int choice = in.nextInt();
            if(choice == 1) {                //Encryption Choice
                System.out.print("Enter the plaintext you would like to encrypt: ");
                String plaintext = inLine.next().replaceAll(" ", "").toUpperCase(); //User input but spaces are removed
                System.out.println(Encryption.encrypt(plaintext));
            } else if(choice == 2) {        //Decryption Choice
                /*
                 *
                 *
                 * Implement Decryption Choice
                 *
                 *
                 * */

            } else if(choice == 3) {        //Exit Choice
                userFinished = true;
            }
        }







    }

    
}
