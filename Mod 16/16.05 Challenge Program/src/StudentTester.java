import java.util.ArrayList;
import java.util.Random;
/**
 * <p>Client class for Student object</p>
 * @author James Harbour
 * @version 3/16/19
 */
public class StudentTester {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        // This part is complicated mainly because I don't want to type stuff out
        // Populates students ArrayList with a bunch of students
        Random rng = new Random();
        String[] names = {"Hachiman Hikigaya", "Kousei Arima", "Mai Sakurajima", "Misaka Mikoto",
                            "Jonathan Joestar", "Kazuto Kirigaya", "Asuna Yuuki",
                            "Lelouch Lamperouge", "Light Yagami", "Jabami Yumeko"};
        for(String name : names) {
            int[] tempqz = new int[5];
            for(int i = 0; i < 5; i++) {
                tempqz[i] = rng.nextInt(100);
            }
            students.add(new Student(name, tempqz[0], tempqz[1], tempqz[2], tempqz[3], tempqz[4]));
        }
        //****************************************************************************************
        // Method Testing

        System.out.print("Original Gradebook: \n\n");
        printTable(students);

        System.out.println("\n<< Replace Hachiman Hikigaya's Name with Kaneki Ken >>\n");
        replaceName(students, "Hachiman Hikigaya", "Kaneki Ken");
        printTable(students);

        System.out.println("\n<< Replace Asuna Yuuki's Quiz 3 Score with 100 >>\n");
        replaceScore(students, "Asuna Yuuki", 3, 100);
        printTable(students);

        System.out.println("\n<< Replace Jonathan Joestar with a new Student Obito Uchiha w/ scores 14, 40, 67, 95, 96 >>\n");
        int[] tempScores1 = {14, 40, 67, 95, 96};
        replaceStudent(students, "Jonathan Joestar", "Obito Uchiha", tempScores1);
        printTable(students);

        System.out.println("\n<< Insert before Jabami Yumeko a new Student Kaguya Shinomiya w/ scores 100, 100, 100, 100, 100 >>\n");
        int[] tempScores2 = {100, 100, 100, 100, 100};
        insertNewBeforeStudent(students, "Jabami Yumeko", "Kaguya Shinomiya", tempScores2);
        printTable(students);

        System.out.println("\n<< Delete Mai Sakurajima from Roster >>\n");
        deleteStudent(students, "Mai Sakurajima");
        printTable(students);

    }

    /**
     * <p>Method displays the current gradebook for a given roster of students</p>
     * @param array Students Roster
     */
    public static void printTable(ArrayList<Student> array) {
        System.out.printf("%20s %5s %5s %5s %5s %5s\n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("---------------------------------------------------");
        for(Student s : array) {
            System.out.println(s);
        }
    }

    /**
     * <p> Replaces the Name of the given Student </p>
     * @param array Students Roster
     * @param findName name of student to find
     * @param newName name to replace findName with
     */
    public static void replaceName(ArrayList<Student> array, String findName, String newName) {
        for(Student s : array) {
            if(s.getName().equals(findName)) {
                s.setName(newName);
            }
        }
    }

    /**
     * <p> Replaces one Quiz Grade of the given Student </p>
     * @param array Students Roster
     * @param studentName Name of Student to replace grade of
     * @param quizNumber Identifier for quiz to replace score
     * @param newScore Score to replace with
     */
    public static void replaceScore(ArrayList<Student> array, String studentName, int quizNumber, int newScore) {
        for(Student s : array) {
            if(s.getName().equals(studentName)) {
                s.setScore(quizNumber, newScore);
            }
        }
    }

    /**
     * <p> Replaces the given Student with a new Student</p>
     * @param array Students Roster
     * @param studentName Student to replace
     * @param newName Name of new Student
     * @param newScores Array of new Student's 5 quiz scores
     */
    public static void replaceStudent(ArrayList<Student> array, String studentName, String newName, int[] newScores) {
        for(Student s : array) {
            if(s.getName().equals(studentName)) {
                s = new Student(newName, newScores[0], newScores[1], newScores[2], newScores[3], newScores[4]);
            }
        }
    }

    /**
     * <p> Inserts new Student before the given Student </p>
     * @param array Students Roster
     * @param studentName Student to replace
     * @param newName Name of new Student
     * @param newScores Array of new Student's 5 quiz scores
     */
    public static void insertNewBeforeStudent(ArrayList<Student> array, String studentName, String newName, int[] newScores) {
        int index = 0;

        for(int i = 0; i < array.size(); i++) {
            Student tempStudent = array.get(i);
            if(tempStudent.getName().equals(studentName)) {
                index = i;
            }
        }

        array.add(index, new Student(newName, newScores[0], newScores[1], newScores[2], newScores[3], newScores[4]));
    }

    /**
     * <p> Removes the given Student from the Roster</p>
     * @param array Students Roster
     * @param studentName Student to remove
     */
    public static void deleteStudent(ArrayList<Student> array, String studentName) {
        int index = 0;
        for(int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(s.getName().equals(studentName)) {
                index = i;
            }
        }
        array.remove(index);
    }

}
