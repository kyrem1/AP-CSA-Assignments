/**
 * <p>
 *     ElectricVehicle Concrete Class
 * </p>
 *
 * @author James Harbour
 * @version 02-22-19
 *
 */
public class ElectricVehicle extends Vehicle{
    private double percent_full_charge;

    /**
     * <p>ElectricVehicle Constructor</p>
     * @param name  Name of ElectricVehicle
     * @param cost  Cost of ElectricVehicle
     */
    public ElectricVehicle(String name, double cost) {
        super(name, cost);
        this.percent_full_charge = 100.0;   // Current Battery Percentage relative to a full charge
    }

    @Override
    public void drive(int miles) {
        double percentage_used_in_trip = (double)miles / 100.0;
        this.percent_full_charge -= percentage_used_in_trip;
        System.out.printf("Drove: %d miles. Used %4.2f Percent of battery. Currently at %4.2f percent", miles, percentage_used_in_trip, percent_full_charge);
    }
}
