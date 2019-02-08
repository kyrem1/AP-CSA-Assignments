
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <p>Class for text analyzer</p>
 *
 *
 * @author James Harbour
 * @version 2/7/19
 *
 */

public class Analyzer {
    private int[] occurrences;
    private int charNum;

    public Analyzer() {
        this.occurrences = new int[26];
        this.charNum = 0;
    }

    /**
     * <p>populates the occurrences array with frequency analysis of given file</p>
     * 
     * @param file Text input file
     * @throws IOException Throw missing input exception
     */
    public void analyze(String fileName) throws IOException{
        // Scanner for the input file
        File file = new File(fileName);
        Scanner inFile = new Scanner(file);

        // Reset occurrences array
        for(int i = 0; i < this.occurrences.length; i++) {
            this.occurrences[i] = 0;
        }

        // Iterate over file util EOF
        String token = "";
        while(inFile.hasNext()) {
            token = inFile.next();
            char[] tokenChars = token.toUpperCase().toCharArray();

            /* Iterate over token char array and increment the
                 corresponding indeces in the occurrences array. */
            for(char c : tokenChars) {
                //Make Sure character is alphabetic
                if((int)c >= 65 && (int)c <= 90) {
                    int cVal = (int)c - 65;
                    this.occurrences[cVal]++;
                }
            }
        }

        //Reset Number of letters
        charNum = 0;

        //Find Total number of letters
        for(int k : this.occurrences) {
            charNum += k;
        }
    }

    //Print the output of the frequency analysis
    public void printFrequency() {
        //Menu Printing
        System.out.printf("%6s   %11s   %9s\n", "Letter", "Occurrences", "Frequency");
        for(int i = 0; i < this.occurrences.length; i++) {
            String iStr = Character.toString((char)(i + 65));
            double freq = 100.0 * (double)this.occurrences[i] / (double)charNum;
            System.out.printf("   %1s      \t%4d\t \t%8.2f\n", iStr, this.occurrences[i], freq);
        }

    }

    //Print Frequency Analysis to Output File
    public void outputFrequency(String fileName) throws IOException{
        String outName = fileName.substring(0, fileName.length() - 4) + "Freq.txt";
        PrintWriter outFile = new PrintWriter(outName);

        for(int i = 0; i < this.occurrences.length; i++) {
            String iStr = Character.toString((char)(i + 65));
            double freq = 100.0 * (double)this.occurrences[i] / (double)charNum;
            outFile.printf("   %1s      \t%4d\t \t%8.2f\n", iStr, this.occurrences[i], freq);
        }

        outFile.close();

    }






    
}
