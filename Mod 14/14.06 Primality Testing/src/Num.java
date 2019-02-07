/**
 * <p>Num Class encapsulates the primality of a number and its value
 * in a single object for efficiency when using ArrayLists.</p>
 *
 * @author James Harbour
 * @version 2/7/19
 *
 * */



public class Num {
    private int value;
    private boolean isPrime;

    //Num Constructor
    public Num(int value) {
        this.value = value;
        this.isPrime = true;
    }


    //Setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setPrimality(boolean primality) {
        this.isPrime = primality;
    }


    //Accessors
    public int getValue() {
        return this.value;
    }

    public boolean getPrimality() {
        return this.isPrime;
    }



}
