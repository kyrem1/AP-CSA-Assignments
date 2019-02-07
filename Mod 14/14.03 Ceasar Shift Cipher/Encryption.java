
/**
 * Class to implement Caesar Cipher Encryption based on a key: 0-25.
 *
 * E_n(x) = (x + n)          if 0 ≤ x + n < 26
 * E_n(x) = (x + n) − 26     if x + n ≥ 26
 *
 * 
 * @author James Harbour
 * @version 2/6/19
 */
public class Encryption
{
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String CIPHER = "";
    
    public Encryption() {
    }

    /**
     *
     * @param n The shift key
     * @return newAlphabet
     */
    public static String cipherAlphabet(int n) {
        //Get char[] from ALPHABET String
        char[] originalChars = ALPHABET.toCharArray();

        //Create int[] for the values of each letter in the original char array
        int[] originalInts = new int[originalChars.length];

        //Populate the originalInts array with int values 0-25, accounting for the ascii
        //N.B. ASCII values for Capital Alphabet is 65-90 inclusive
        for(int i = 0; i < originalChars.length; i++) {
            originalInts[i] = (int)originalChars[i]-65;
        }

        //Create int[] for cipherText values
        int[] newInts = new int[originalInts.length];

        //Iterate over original ints and use Encryption formula, then account for ascii
        for(int i = 0; i < originalInts.length; i++) {
            int k = originalInts[i];
            if(k + n >= 0 && k + n < 26) {
                newInts[i] = (k + n) + 65;
            } else if(k + n >= 26) {
                newInts[i] = ((k + n) - 26) + 65;
            } else {
                System.out.println("Error with k: " + k + "\tand i: " + i);
            }
        }

        String newAlphabet = "";

        for(int k : newInts) {
            newAlphabet += Character.toString((char)k);
        }

        CIPHER = newAlphabet;

        return newAlphabet;
    }

    /**
     *
     * @param plain The plaintext to be shifted
     * @return The encrypted text
     */
    public static String encrypt(String plain) {
        char[] originalChars = ALPHABET.toCharArray();
        char[] cipherChars = CIPHER.toCharArray();
        char[] plainChars = plain.toCharArray();

        String newText = "";

        for (int i = 0; i < plainChars.length; i++) {
            int index = 0;
            Character pChar = plainChars[i];
            boolean charFound = false;
            while (!charFound) {
                if (pChar.equals(originalChars[index])) {
                    newText += Character.toString(cipherChars[index]);
                    charFound = true;
                } else {
                    index++;
                }
            }
        }

        return newText;

    }
    
}
