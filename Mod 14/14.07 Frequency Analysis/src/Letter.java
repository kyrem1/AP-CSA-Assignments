/**
 * <p>Letter Object</p>
 *
 * @author James Harbour
 * @version 2/8/19
 */

public class Letter {
    private String letterStr;
    private double freq;

    public Letter(String letterStr, double freq) {
        this.letterStr = letterStr;
        this.freq = freq;
    }

    //Getters
    public String getLetterStr() {
        return letterStr;
    }

    public double getFreq() {
        return freq;
    }
}
