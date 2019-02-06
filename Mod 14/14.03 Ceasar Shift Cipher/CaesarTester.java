
/**
 * Write a description of class CaesarTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CaesarTester
{
    
    public static void main() {
        //Create Instance of Scanner
        Scanner in = new Scanner(System.in);
        
        //User input for shift
        System.out.print("Input a shift key value from 0–25: ");
        int s = in.nextInt();
        
        //Ensure Input is valid
        while(s < 0 || s > 25) {
            System.out.print("Please input a shift key value from 0–25: ");
            s = in.nextInt();
        }
        
    }

    
}
