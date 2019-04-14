/**
 * <p>Implements a Student Object</p>
 * @author James Harbour
 * @version 04/14/19
 */
public class Student {
    private String firstName;
    private String lastName;
    private double[] scores;
    private String grade;

    public Student(String firstName, String lastName, double[] scores) {
        this.firstName = firstName;
        if (firstName.equals("")) {
            throw new IllegalArgumentException("First Name is Empty");
        }
        this.lastName = lastName;
        if (lastName.equals("")) {
            throw new IllegalArgumentException("First Name is Empty");
        }
        this.scores = scores;
        this.grade = letterGrade(scores);
    }

    public String letterGrade(double[] scores) {
        if(scores.length == 0) {
            throw new IllegalArgumentException("Scores array cannot be empty");
        }
        double total = 0;
        for(double score : scores) {
            total += score;
        }
        double avg = total / (double)scores.length;
        if(avg <= 100 && avg >= 90) {
            return "A";
        } else if(avg < 90 && avg >= 80) {
            return "B";
        } else if(avg < 80 && avg >= 70) {
            return "C";
        }else if(avg < 70 && avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        String s = "";
        s += firstName + " " + lastName + " -- " + grade + ": ";
        for(double score : scores) {
            s += "   " + score;
        }
        return s;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
