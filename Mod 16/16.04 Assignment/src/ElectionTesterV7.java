/**
 * <p>Array Tester Class for Candidate Class Algorithms</p>
 * @author James Harbour
 * @version 3/7/19
 * //TODO Modify all methods to handle null array elements
 */
public class ElectionTesterV7 {

    public static void main(String[] args) {
        // Candidate Array
        Candidate[] candidates = {new Candidate("Mary Lewis", 30), new Candidate("Bob Jones", 27),
                                    new Candidate("Harper Hills", 21), new Candidate("Jeremy Chu", 31),
                                    new Candidate("Grace Ham", 43)};

        System.out.println("Original Results:");
        printTable(candidates);

        System.out.println("<< Deleted Candidate at Position 3 >>");
        deleteCandidateAtPos(candidates, 3);
        printTable(candidates);


        System.out.println("<< Deleted Candidate with name Bob Jones >>");
        deleteCandidateWithName(candidates, "Bob Jones");
        printTable(candidates);
    }

    /**
     * <p>Traverses through array and prints out each element</p>
     * @param array Candidates Array
     */
    public static void printAllVoteName(Candidate[] array) {
        for(Candidate c : array) {
            if(c != null) {
                System.out.println(c);
            }
        }
    }

    /**
     * <p>Traverses through array and finds total number of votes</p>
     * @param array Candidates Array
     */
    public static int voteTotal(Candidate[] array) {
        int total = 0;
        for(Candidate c : array) {
            if(c != null) {
                total += c.getNumVotes();
            }
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
            if(c != null) {
                System.out.printf("%-13s \t\t %13d \t\t %13.2f\n", c.getName(), c.getNumVotes(), (double)c.getNumVotes()*100/total);
            }
        }
        System.out.println("Total number of votes cast in election: " + total + "\n");
    }

    /**
     * <p>Find Candidate by name and changes name of said Candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to find
     * @param replacementName Name to replace current name of Candidate
     */
    public static void changeName(Candidate[] array, String findName, String replacementName) {
        for(Candidate c : array) {
            if(c != null) {
                if (c.getName().equals(findName)) {
                    c.setName(replacementName);
                    break;
                }
            }
        }
    }

    /**
     * <p>Find Candidate by name and changes vote number of said Candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to find
     * @param newNumVotes Vote Number to replace current Vote Number of Candidate
     */
    public static void changeVotes(Candidate[] array, String findName, int newNumVotes) {
        for(Candidate c : array) {
            if (c != null) {
                if(c.getName().equals(findName)) {
                    c.setNumVotes(newNumVotes);
                    break;
                }
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
    public static void changeNameVotes(Candidate[] array, String findName, String replacementName, int newNumVotes) {
        for(Candidate c : array) {
            if(c != null) {
                if (c.getName().equals(findName)) {
                    c.setName(replacementName);
                    c.setNumVotes(newNumVotes);
                    break;
                }
            }
        }
    }


    /**
     * <p> insert a new candidate into a specified position</p>
     * @param array Election Data
     * @param position Position to Insert at
     * @param name Name of new Candidate
     * @param votes Number of votes for new Candidate
     */
    public static void insertCandidateAtPos(Candidate[] array, int position, String name, int votes) {
        Candidate newCandidate = new Candidate(name, votes);
        array[position] = newCandidate;
    }

    /**
     * <p>a method that will find a particular candidate by name and then insert a new candidate before that candidate</p>
     * @param array Election Data
     * @param findName Name of Candidate to insert before
     * @param newName Name of new Candidate
     * @param newVotes Number of votes for new Candidate
     */
    public static void insertCandidateBeforeName(Candidate[] array, String findName, String newName, int newVotes) {
        Candidate newCandidate = new Candidate(newName, newVotes);
        int cPos = 0;

        // Find Position to insert
        for(int i = 0; i < array.length; i++) {
            Candidate c = array[i];
            if(c != null) {
                if (c.getName().equals(findName)) {
                    cPos = i;
                }
            }
        }

        for(int i = array.length - 1; i >= cPos; i--) {
            array[i] = array[i-1];
        }
        array[cPos] = newCandidate;
    }

    /**
     * <p>delete a particular candidate by position in the election array</p>
     * @param array Candidate Data
     * @param delPos Position of candidate to delete
     */
    public static void deleteCandidateAtPos(Candidate[] array, int delPos) {
        array[delPos] = null;
    }

    /**
     * <p>find a particular candidate by name and delete that candidate</p>
     * @param array Candidate Data
     * @param delName Name of candidate to delete
     */
    public static void deleteCandidateWithName(Candidate[] array, String delName) {
        for(Candidate c : array) {
            if(c != null) {
                if (c.getName().equals(delName)) {
                    c = null;
                }
            }
        }
    }


}
