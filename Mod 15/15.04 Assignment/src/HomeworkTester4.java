/**
 * <p>Client class for the Homework Hierarchy</p>
 *
 * @author James Harbour
 * @version 2/11/19
 * @uses java.util.ArrayList
 */

import java.util.ArrayList;
public class HomeworkTester4 {
    public static void main(String[] args) {
        // Create Instance of each Course Subject
        USHistory4 ushistory = new USHistory4();
        English4 english = new English4();
        Latin4 latin = new Latin4();
        Calculus4 calculus = new Calculus4();

        // Create assignment for each course
        ushistory.assign(9);
        english.assign(6);
        latin.assign(6);
        calculus.assign(13);

        // Use an ArrayList to organize courses
        ArrayList<Homework4> hmwk = new ArrayList<>();
        hmwk.add(ushistory);
        hmwk.add(english);
        hmwk.add(latin);
        hmwk.add(calculus);

        // Display a list of assignments to be completed
        System.out.println("\t\t\t     My Homework List");
        System.out.println("---------------------------------------------------");
        for(Homework4 h : hmwk) {
            System.out.println(h.toString());
        }
        System.out.println("\n\n");

        // Assignment Length Comparison (Should have 4 choose 2 = 6 entries)
        // Uses nested for() loops to compare each assignment once
        System.out.println("\t\t\t     Comparing my Homework");
        System.out.println("-------------------------------------------------------");
        Homework4 tempHmwk1;
        Homework4 tempHmwk2;
        for(int i = 0; i < hmwk.size(); i++) {
            tempHmwk1 = hmwk.get(i);
            for(int j = i + 1; j < hmwk.size(); j++) {
                tempHmwk2 = hmwk.get(j);
                int comparison = tempHmwk1.compareTo(tempHmwk2);
                if(comparison < 0) {              // hmwk1 is less than hmwk 2
                    System.out.println(tempHmwk1.getType() + " has LESS pages to read than " + tempHmwk2.getType());
                } else if(comparison == 0) {        // hmwk1 is equal to hmwk 2
                    System.out.println(tempHmwk1.getType() + " has THE SAME amount of pages to read as " + tempHmwk2.getType());
                } else {                            // hmwk1 is greater than hmwk2
                    System.out.println(tempHmwk1.getType() + " has MORE pages to read than " + tempHmwk2.getType());
                }
            }
        }
    }

}
