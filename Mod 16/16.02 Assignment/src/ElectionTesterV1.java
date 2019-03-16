/**
 * <p>Array Tester Class for Candidate Class Algorithms</p>
 * @author James Harbour
 * @version 3/7/19
 *
 */
public class ElectionTesterV1 {

    public static void main(String[] args) {
        // Candidate Array
        Candidate[] candidates = {new Candidate("Mary Lewis", 30), new Candidate("Bob Jones", 27),
                new Candidate("Harper Hills", 21), new Candidate("Jeremy Chu", 31),
                new Candidate("Grace Ham", 43)};

        System.out.println("Raw Election Data:");
        printAllVoteName(candidates);

        System.out.print("\n\n");

        System.out.println("Election Results");
        printTable(candidates);
    }

    /**
     * <p>Traverses through array and prints out each element</p>
     * @param array Candidates Array
     */
    public static void printAllVoteName(Candidate[] array) {
        for(Candidate c : array) {
            System.out.println(c);
        }
    }

    /**
     * <p>Traverses through array and finds total number of votes</p>
     * @param array Candidates Array
     */
    public static int voteTotal(Candidate[] array) {
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
    public static void printTable(Candidate[] array) {
        System.out.printf("%-13s \t\t %13s \t\t %13s\n", "Candidate", "No. of Votes", "% of total votes");
        System.out.println("---------------------------------------------------------");
        int total = voteTotal(array);
        for(Candidate c : array) {
            System.out.printf("%-13s \t\t %13d \t\t %13.2f\n", c.getName(), c.getNumVotes(), (double)c.getNumVotes()*100/total);
        }
        System.out.println("Total number of votes cast in election: " + total + "\n");
    }



}
