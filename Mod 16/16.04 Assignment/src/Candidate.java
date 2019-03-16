/**
 * @author James Harbour
 * @version 3/7/19
 */
public class Candidate {
    // Instance Vars
    private int numVotes;
    private String name;

    // Constructor
    public Candidate(String name, int numVotes) {
        this.name = name;
        this.numVotes = numVotes;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public String getName() {
        return name;
    }

    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " received " + numVotes + " votes.";
    }
}
