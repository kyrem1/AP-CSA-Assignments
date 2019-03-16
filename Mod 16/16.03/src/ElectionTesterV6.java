import java.util.ArrayList;

/**
 * <p>ArrayList Tester Class for Candidate Class Algorithms</p>
 * @author James Harbour
 * @version 3/7/19
 * //TODO Add replacement methods from V3
 */
public class ElectionTesterV6 {

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

        System.out.println("<< Inserted James Harbour with 30 votes at position 2 >>");
        insertCandidateAtPos(candidates, 2, "James Harbour", 30);
        printTable(candidates);

        System.out.println("<< Inserted Jackie Sith before James Harbour >>");
        insertCandidateBeforeName(candidates, "James Harbour", "Jackie Sith", 10);
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

    /**
     * <p>insert a new candidate into a specified position</p>
     * @param array Election Data
     * @param position Position to Insert at
     * @param name Name of new Candidate
     * @param votes Number of votes for new Candidate
     */
    public static void insertCandidateAtPos(ArrayList<Candidate> array, int position, String name, int votes) {
        Candidate newCandidate = new Candidate(name, votes);
        array.add(position, newCandidate);
    }

    /**
     * <p>a method that will find a particular candidate by name and then insert a new candidate before that candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to insert before
     * @param newName Name of new Candidate
     * @param newVotes Number of votes for new Candidate
     */
    public static void insertCandidateBeforeName(ArrayList<Candidate> array, String findName, String newName, int newVotes) {
        Candidate newCandidate = new Candidate(newName, newVotes);
        int cPos = 0;

        // Find Position to insert
        for(int i = 0; i < array.size(); i++) {
            Candidate c = array.get(i);
            if(c.getName().equals(findName)) {
                cPos = i;
            }
        }

        array.add(cPos, newCandidate);
    }


}
