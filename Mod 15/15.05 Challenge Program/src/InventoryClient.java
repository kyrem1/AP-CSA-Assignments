import java.util.ArrayList;

/**
 * <p>Client class for Inventory Project</p>
 * @author James Harbour
 * @version 02-22-19
 */
public class InventoryClient {
    public static void main(String[] args) {
        // Instantiate objects
        GasVehicle gasVehicle = new GasVehicle("Honda Accord", 14666.0, 400);
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model X", 84699.0);
        Tool jigsaw = new Tool("Jigsaw", 230.0);
        Tool hacksaw = new Tool("Hacksaw", 39.99);


        // Instantiate and Populate ArrayList
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(gasVehicle);
        inventory.add(electricVehicle);
        inventory.add(jigsaw);
        inventory.add(hacksaw);




    }

    // TODO Implement Me
    public static void takeInventory(String product_name) {

    }

}
