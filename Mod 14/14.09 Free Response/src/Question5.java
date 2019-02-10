/**
 * @author James Harbour
 * @version 2/10/19
 */

public class Question5 {
    public Question5() {

    }


    public double calcTip(double percent, double mealCost) {
        double proportion = percent / 100.0;
        return mealCost * proportion;
    }

    public double calcTip(double mealCost) {
        double proportion = 0.175;
        return mealCost * proportion;
    }


}
