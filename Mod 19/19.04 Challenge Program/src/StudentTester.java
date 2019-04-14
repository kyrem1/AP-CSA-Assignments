/**
 * <p>Client Class for the Student object</p>
 * @author James Harbour
 * @version 04/14/19
 */
public class StudentTester {
    // Comment Out Method Calls for Testing
    public static void main(String[] args) {
//        testShouldSucceed();
        testShouldFail();
    }

    public static void testShouldFail() {
        double[] scores = {};
        Student boi = new Student("Sherbert", "Sai", scores);
        System.out.print(boi);
    }

    public static void testShouldSucceed() {
        double[] scores1 = {99.5, 45.4, 67.56, 66.66, 54.55};
        double[] scores2 = {99.5, 89.9, 95.55, 92.44, 89.66, 91.10, 87.10};
        Student boi1 = new Student("Jesiah", "Sail", scores1);
        Student boi2 = new Student("John", "Laughler", scores2);
        System.out.print(boi1 + "\n" + boi2);
    }
}
