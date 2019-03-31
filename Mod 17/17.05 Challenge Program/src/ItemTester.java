import java.util.Random;
/**
 * <p>Client Class for testing the
 *  item class. Uses various sorting
 *  methods to sort array of items.</p>
 *
 * @author James Harbour
 */
public class ItemTester {
    public static void main(String[] args) {
        Random rng = new Random();
        String[] names = {"Red Shelf",
                            "Refrigerator",
                            "D Ring Binder",
                            "R380 Telephone",
                            "Air Purifier",
                            "Floodlight Bulb",
                            "Angle D Binder",
                            "Wire Frame",
                            "Wire Shelving",
                            "Xerox 198"};

        Item[] items = new Item[names.length];
        for(int i = 0; i < names.length; i++) {
            int prodNo = rng.nextInt((9999 - 1000) + 1) + 1000; // Int in range [1000, 9999]
            double price = (rng.nextDouble()*((99 - 10) + 1)) + 10; // Double in range [10, 99]
            int qty = rng.nextInt(1000); // Int in range [0, 999]
            items[i] = new Item(names[i], prodNo, price, qty);
        }


        System.out.println("Original List");
        printAll(items);

        sortName(items, 1);
        printAll(items);

        sortPrice(items, 1);
        printAll(items);

        System.out.println("<< Algorithm: Merge Sort | By Quantity | Direction: ascending >>");
        sortQty(items, 0, items.length - 1);
        printAll(items);

        sortName(items, 2);
        printAll(items);

        sortPrice(items, 2);
        printAll(items);
    }


    public static void printAll(Item[] a) {
        System.out.printf("%-21s   %-16s   %-13s   %-14s\n", "Name  ", "Product No  ", "Price  ", "Quantity  ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        for(Item i : a) {
            System.out.println(i);
        }
        System.out.print("\n");
    }

    /**
     * <p>Sorts by Name.
     *    Algorithm: Insertion Sort
     *      For each element A[i], if A[i] > A[i+1], swap the elements until A[i] <= A[i+1]
     * </p>
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortName(Item[] a, int direction) {
        String dir;
        if(direction == 1) {
            dir = "ascending";
        } else {
            dir = "descending";
        }
        System.out.printf("<< Algorithm: Insertion Sort | By Name | Direction: %s >>\n", dir);
        for(int i = 1; i < a.length; i++) {
            Item x = a[i];
            int j = i - 1;
            if (direction == 1) {
                while (j >= 0 && a[j].getName().compareTo(x.getName()) > 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            } else if (direction == 2) {
                while (j >= 0 && a[j].getName().compareTo(x.getName()) < 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            }
            a[j+1] = x;
        }
    }

    /**
     * <p>Swaps a[i1] and a[i2]</p>
     *
     * @param a Insert Array with elements to swap
     * @param i1 index of element
     * @param i2 index of element
     */
    public static void swap(Item[] a, int i1, int i2) {
        if(i1 != i2) {
            Item tempItem = a[i1];
            a[i1] = a[i2];
            a[i2] = tempItem;
        }
    }

    /**
     * <p>Selection Sort: by Price</p>
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortPrice(Item[] a, int direction) {
        String dir;
        if(direction == 1) {
            dir = "ascending";
        } else {
            dir = "descending";
        }
        System.out.printf("<< Algorithm: Selection Sort | By Price | Direction: %s >>\n", dir);
        int min;
        if(direction == 1) {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getPrice() < a[min].getPrice()) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        } else {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getPrice() > a[min].getPrice()) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        }
    }

    public static void mergeQty(Item[] a, int low, int mid, int high) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        Item[] left = new Item[leftLength];
        Item[] right = new Item[rightLength];

        for(int i = 0; i < leftLength; i++) {
            left[i] = a[i + low];
        }
        for(int i = 0; i < rightLength; i++) {
            right[i] = a[i + mid + 1];
        }

        // Comparison Part
        int i = 0, j = 0, k = low;
        while (i < leftLength && j < rightLength) {
            if (left[i].getQty() <= right[j].getQty()) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++; }
            k++;
        }

        // Make Sure Everything has copied over after comparisons
        while(i < leftLength) {
            a[k] = left[i];
            i++;
            k++;
        }
        while(j < rightLength) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    /**
     * <p>Merge Sort: by Qty</p>
     *
     * @param a Insert Array to be sorted
     */
    public static void sortQty(Item[] a, int low, int high) {
        if(low == high) {
            return;
        }

        int mid = (low + high) / 2;
        sortQty(a, low, mid);
        sortQty(a, mid + 1, high);

        mergeQty(a, low, mid, high);
    }


}
