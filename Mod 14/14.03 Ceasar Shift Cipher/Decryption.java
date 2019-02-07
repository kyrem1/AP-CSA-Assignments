/**
 * Class to implement Caesar Cipher Decryption based on a key: 0-25.
 *
 * Dn(x) = (x − n)          if 0 ≤ x − n < 26
 * Dn(x) = (x − n) + 26     if  x − n < 0
 *
 *
 * @author James Harbour
 * @version 2/6/19
 */

public class Decryption {

    public static String decrypt(String cipher) {
        char[] originalChars = Encryption.ALPHABET.toCharArray();
        char[] cipherChars = Encryption.CIPHER.toCharArray();
        char[] inputChars = cipher.toCharArray();

        String newText = "";

        for (int i = 0; i < inputChars.length; i++) {
            int index = 0;
            Character pChar = inputChars[i];
            boolean charFound = false;
            while (!charFound) {
                if (pChar.equals(cipherChars[index])) {
                    newText += Character.toString(originalChars[index]);
                    charFound = true;
                } else {
                    index++;
                }
            }
        }

        return newText;
    }

}
