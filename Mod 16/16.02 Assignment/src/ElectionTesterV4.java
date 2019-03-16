import java.util.ArrayList;

/**
 * <p>ArrayList Tester Class for Candidate Class Algorithms</p>
 * @author James Harbour
 * @version 3/7/19
 * //TODO Add replacement methods from V3
 */
public class ElectionTesterV4 {

    public static void main(String[] args) {
        // Candidate ArrayList
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Bob Jones", 27));
        candidates.add(new Candidate("Mary Lewis", 30));
        candidates.add(new Candidate("Harper Hills", 21));
        candidates.add(new Candidate("Jeremy Chu", 31));
        candidates.add(new Candidate("Grace Ham", 43));

        System.out.println("Original Results:");
        printTable(candidates);

        System.out.println("<< Changing Jeremy Chu to Boris Lu >>\n");
        changeName(candidates, "Jeremy Chu", "Boris Lu");
        printTable(candidates);

        System.out.println("<< Changing Mary Lewis votes to 297 >>\n");
        changeVotes(candidates, "Mary Lewis", 297);
        printTable(candidates);

        System.out.println("<< Changing Bob Jones name to Blake Ban and votes to 185 >>\n");
        changeNameVotes(candidates, "Bob Jones", "Blake Ban", 185);
        printTable(candidates);
    }

    /**
     * <p>Traverses through array and prints out each element</p>
     * @param array Candidates Array
     */
    public static void printAllVoteName(ArrayList<Candidate> array) {
        for(Candidate c : array) {
            System.out.println(c);
        }
    }

    /**
     * <p>Traverses through array and finds total number of votes</p>
     * @param array Candidates Array
     */
    public static int voteTotal(ArrayList<Candidate> array) {
        int total = 0;
        for(Candidate c : array) {
            total += c.getNumVotes();
        }
        return total;
    }

    /**
     * <p>Tabulates Election Data</p>
     * @param array Array of Election Data
     */
    public static void printTable(ArrayList<Candidate> array) {
        System.out.printf("%-13s \t\t %13s \t\t %13s\n", "Candidate", "No. of Votes", "% of total votes");
        System.out.println("---------------------------------------------------------");
        int total = voteTotal(array);
        for(Candidate c : array) {
            System.out.printf("%-13s \t\t %13d \t\t %13.2f\n", c.getName(), c.getNumVotes(), (double)c.getNumVotes()*100/total);
        }
        System.out.println("Total number of votes cast in election: " + total + "\n");
    }

    /**
     * <p>Find Candidate by name and changes name of said Candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to find
     * @param replacementName Name to replace current name of Candidate
     */
    public static void changeName(ArrayList<Candidate> array, String findName, String replacementName) {
        for(Candidate c : array) {
            if(c.getName().equals(findName)) {
                c.setName(replacementName);
                break;
            }
        }
    }

    /**
     * <p>Find Candidate by name and changes vote number of said Candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to find
     * @param newNumVotes Vote Number to replace current Vote Number of Candidate
     */
    public static void changeVotes(ArrayList<Candidate> array, String findName, int newNumVotes) {
        for(Candidate c : array) {
            if(c.getName().equals(findName)) {
                c.setNumVotes(newNumVotes);
                break;
            }
        }
    }

    /**
     * <p>Find Candidate by name and changes name and vote number of said Candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to
     * @param replacementName Name to replace current name of Candidate
     * @param newNumVotes Vote Number to replace current Vote Number of Candidate
     */
    public static void changeNameVotes(ArrayList<Candidate> array, String findName, String replacementName, int newNumVotes) {
        for(Candidate c : array) {
            if(c.getName().equals(findName)) {
                c.setName(replacementName);
                c.setNumVotes(newNumVotes);
                break;
            }
        }
    }


}
