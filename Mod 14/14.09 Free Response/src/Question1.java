/**
 * @author James Harbour
 * @version 2/10/19
 */


public class Question1 {
    private int number;

    public Question1() {
        this.number = 5;
    }


    public void subtractNumbers(int number) {
        this.number = this.number - number;
        System.out.println("The local variable is: " + number);
        System.out.println("The instance variable is: " + this.number);
    }


}
