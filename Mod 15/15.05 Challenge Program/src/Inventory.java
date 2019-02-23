import java.util.ArrayList;

/**
 * <p>Client class for Inventory Project</p>
 * @author James Harbour
 * @version 02-22-19
 */
public class Inventory {
    private static ArrayList<Product> inventory;

    public Inventory() {
        GasVehicle gasVehicle = new GasVehicle("Honda Accord", 14666.0, 400);
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model X", 84699.0);
        Tool jigsaw1 = new Tool("Jigsaw", 230.00);
        Tool jigsaw2 = new Tool("Jigsaw", 210.00);
        Tool hacksaw1 = new Tool("Hacksaw", 39.99);
        Tool hacksaw2 = new Tool("Hacksaw", 41.99);


        // Instantiate and Populate ArrayList
        inventory = new ArrayList<Product>();
        inventory.add(gasVehicle);
        inventory.add(electricVehicle);
        inventory.add(jigsaw1);
        inventory.add(jigsaw2);
        inventory.add(hacksaw1);
        inventory.add(hacksaw2);
    }


    // TODO Implement Me
    public static void takeInventory(String product_name) {
        int quantity = 0;
        double totalCost = 0.0;

        for(Product p : inventory) {
            if(p.getName().equals(product_name)) {
                quantity++;
                totalCost += p.getCost();
            }
        }

        System.out.printf("Item Name: %s   |   Quantity: %d   |   Total Cost: %.2f", product_name, quantity, totalCost);
        System.out.print("\n\n\n");
    }

    public static void main(String[] args) {
        // Run's the takeInventory method
        Inventory inv = new Inventory();
        Inventory.takeInventory("Jigsaw");

        // Tests the compareTo method for the Tool object
        Tool test1 = new Tool("Jigsaw", 99.99);
        Tool test2 = new Tool("Hammer", 8.99);

        if(test1.compareTo(test2) > 0) {
            System.out.println("The Jigsaw costs more than the hammer");
        } else if(test1.compareTo(test2) == 0) {
            System.out.println("The Jigsaw costs the same amount as the hammer");
        } else {
            System.out.println("The Jigsaw costs the same amount as the hammer");
        }
    }

}
