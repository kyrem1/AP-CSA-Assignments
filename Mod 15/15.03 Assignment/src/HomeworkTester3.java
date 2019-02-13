/**
 * <p>Client class for the Homework Hierarchy</p>
 *
 * @author James Harbour
 * @version 2/11/19
 * @uses java.util.ArrayList
 */

import java.util.ArrayList;
public class HomeworkTester3 {
    public static void main(String[] args) {
        // Create Instance of each Course Subject
        USHistory3 ushistory = new USHistory3();
        English3 english = new English3();
        Latin3 latin = new Latin3();
        Calculus3 calculus = new Calculus3();

        // Create assignment for each course
        ushistory.assign(9);
        english.assign(6);
        latin.assign(4);
        calculus.assign(13);

        // Use an ArrayList to organize courses
        ArrayList<Homework3> hmwk = new ArrayList<>();
        hmwk.add(ushistory);
        hmwk.add(english);
        hmwk.add(latin);
        hmwk.add(calculus);

        // Display a list of assignments to be completed
        System.out.println("\t\t\t     My Homework");
        System.out.println("---------------------------------------------------");
        for(Homework3 h : hmwk) {
            System.out.println("Before Reading: " + h.toString());
            h.doHomework(2);
            System.out.println("After Reading: " + h.toString());
            System.out.println();
        }
    }

}
