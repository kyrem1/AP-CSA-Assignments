import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * <p>Uses Frequency Comparison to Decode polyalphabetic ciphers</p>
 *
 * @author James Harbour
 * @version 2/8/19
 */

public class Decoder {
    private File plainFreqFile;
    private File cipherFreqFile;
    private File ciphertext;

    private ArrayList<Letter> plainLetters;
    private ArrayList<Letter> cipherLetters;

    public Decoder(File plainFreqFile, File cipherFreqFile, File ciphertext) throws IOException{
        this.plainFreqFile = plainFreqFile;
        this.cipherFreqFile = cipherFreqFile;
        this.ciphertext = ciphertext;

        plainLetters = new ArrayList<Letter>();
        cipherLetters = new ArrayList<Letter>();

        Scanner plainFreqIn = new Scanner(this.plainFreqFile);
        Scanner cipherFreqIn = new Scanner(this.cipherFreqFile);


        // Iterate over plaintext frequencies and populate plainLetters array
        String tokenString = "";
        int tempInt = 0;
        double tokenDouble = 0.0;

        while(plainFreqIn.hasNext()) {
            tokenString = plainFreqIn.next();
            tempInt = plainFreqIn.nextInt();
            tokenDouble = plainFreqIn.nextDouble();

            plainLetters.add(new Letter(tokenString, tokenDouble));

        }


        // Iterate over ciphertext frequencies and populate cipherLetters array
        while(cipherFreqIn.hasNext()) {
            tokenString = cipherFreqIn.next();
            tempInt = cipherFreqIn.nextInt();
            tokenDouble = cipherFreqIn.nextDouble();

            cipherLetters.add(new Letter(tokenString, tokenDouble));
        }


    }

    //Use a simple sorting alg cuz length = 26 so time complexity is not a factor
    public void sortFrequencies() {

    }


    public String generateAlphabet() {

        return "";
    }


}
