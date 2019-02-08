/**
 * <p>Client Class for the text analyzer</p>
 *
 *
 * @author James Harbour
 * @version 2/7/19
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class AnalyzerText {

    public static void main(String[] args) throws IOException {
        // Instantiate Analyzer object
        Analyzer a = new Analyzer();

        // Instantiate user input Scanner object
        Scanner in = new Scanner(System.in);

        // User Input
        System.out.print("What is the name of your file: ");
        String file_name = in.next();
        System.out.print("\n\n");

        // Analyze the file
        a.analyze(file_name);
        a.outputFrequency(file_name);
        a.printFrequency();

    }

}
