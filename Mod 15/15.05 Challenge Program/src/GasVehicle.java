/**
 * <p>
 *     GasVehicle Concrete Class
 * </p>
 * @author James Harbour
 * @version 02-22-19
 */
public class GasVehicle extends Vehicle {

    private double fuel_in_gallons;

    /**
     * <p>GasVehicle Constructor</p>
     * @param name  Name of GasVehicle
     * @param cost  Cost of GasVehicle
     * @param fuel_in_gallons  Fuel in tank for GasVehicle
     */
    public GasVehicle(String name, double cost, double fuel_in_gallons) {
        super(name, cost);
        this.fuel_in_gallons = fuel_in_gallons;
    }

    @Override
    public void drive(int miles) {
        double used_fuel = (double)miles / 35.0;
        this.fuel_in_gallons -= used_fuel;
        System.out.printf("Drove: %d miles. Used %4.2f gallons of fuel. %4.2f gallons of fuel left in tank", miles, used_fuel, this.fuel_in_gallons);
    }

    public double getFuel_in_gallons() {
        return fuel_in_gallons;
    }

}
