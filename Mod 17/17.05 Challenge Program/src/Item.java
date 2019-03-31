
/**
 * <p>Implementation Class for an item/product in a store</p>
 * @author James Harbour
 */
public class Item {
    private String name;    //Product name
    private int prodNo;     //Product Number
    private double price;   //Product Price
    private int qty;        //Quantity of Product in Store

    public Item(String name, int prodNo, double price, int qty) {
        this.name = name;
        this.prodNo = prodNo;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("%6s%-15s | %12s%4d | %7s%4.2f | %11s%03d", "Name: ", name, "Product No: ", prodNo, "Price: ", price, "Quantity: ", qty);
    }

    public String getName() {
        return name;
    }

    public int getProdNo() {
        return prodNo;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProdNo(int prodNo) {
        this.prodNo = prodNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}
