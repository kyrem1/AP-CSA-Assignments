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
        latin.assign(4);
        calculus.assign(13);

        // Use an ArrayList to organize courses
        ArrayList<Homework4> hmwk = new ArrayList<>();
        hmwk.add(ushistory);
        hmwk.add(english);
        hmwk.add(latin);
        hmwk.add(calculus);

        // Display a list of assignments to be completed
        System.out.println("\t\t\t     My Homework");
        System.out.println("---------------------------------------------------");
        for(Homework4 h : hmwk) {
            System.out.println("Before Reading: " + h.toString());
            h.doHomework(2);
            System.out.println("After Reading: " + h.toString());
            System.out.println();
        }
    }

}
