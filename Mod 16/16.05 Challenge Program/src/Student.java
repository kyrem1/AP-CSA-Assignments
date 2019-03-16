/**
 * <p>Defines a Student Object, which contains name and 5 quiz scores
 *      N.B. Quiz scores are stored in an array</p>
 * @author James Harbour
 * @version 3/16/19
 */
public class Student {
    private String name;    // Name of Student Object
    private int[] quizzes;  // Array for 5 quiz scores

    public Student(String name, int q1, int q2, int q3, int q4, int q5) {
        this.name = name;

        int[] tempArray = {q1, q2, q3, q4, q5};
        this.quizzes = tempArray;
    }

    /**
     * <p>Getter method for quiz score with specified quiz number [1-5]</p>
     * @param quizNumber quiz number from 1 to 5 inclusive
     * @return quiz score with specified number
     */
    public int getQuiz(int quizNumber) {
        return quizzes[quizNumber-1];
    }

    /**
     * <p>Setter method for quiz score with specified quiz number</p>
     * @param quizNumber quiz number from 1 to 5 inclusive
     * @param newScore quiz score to replace old quiz score
     */
    public void setScore(int quizNumber, int newScore) {
        quizzes[quizNumber - 1] = newScore;
    }

    /**
     * <p>Getter method for Student's name</p>
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Setter method for Student's name</p>
     * @param name Name to store in Student Object
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%20s %5d %5d %5d %5d %5d", this.name, this.quizzes[0], this.quizzes[1], this.quizzes[2], this.quizzes[3], this.quizzes[4]);
    }
}
