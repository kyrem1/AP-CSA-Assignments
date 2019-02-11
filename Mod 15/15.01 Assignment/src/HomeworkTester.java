/**
 * <p>Client class for the Homework Hierarchy</p>
 *
 * @author James Harbour
 * @version 2/11/19
 * @uses java.util.ArrayList
 */

import java.util.ArrayList;
public class HomeworkTester {
    public static void main(String[] args) {
        // Create Instance of each Course Subject
        USHistory ushistory = new USHistory();
        English english = new English();
        Latin latin = new Latin();
        Calculus calculus = new Calculus();

        // Create assignment for each course
        ushistory.assign(9);
        english.assign(6);
        latin.assign(4);
        calculus.assign(3);

        // Use an ArrayList to organize courses
        ArrayList<Homework> hmwk = new ArrayList<>();
        hmwk.add(ushistory);
        hmwk.add(english);
        hmwk.add(latin);
        hmwk.add(calculus);

        // Display a list of assignments to be completed
        System.out.println("\t My Homework Reading To-Do");
        System.out.println("-----------------------------------");
        for(Homework h : hmwk) {
            System.out.println(h.toString());
        }
    }
}
