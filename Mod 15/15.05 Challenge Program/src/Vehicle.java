/**
 * @author James Harbour
 * @version 02-22-19
 */
public abstract class Vehicle implements Product {

    private String name;
    private double cost;

    /**
     * Vehicle Constructor
     * @param name  Name of product
     * @param cost  Cost of product in Dollars.Cents
     */
    public Vehicle(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstract void drive(int miles);

}
