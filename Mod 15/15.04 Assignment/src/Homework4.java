/**
 * <p>Abstract class defining Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public abstract class Homework4 implements Processing, Comparable<Homework4>{
    // Instance Variables
    private int numPages;
    private String type;

    // Homework Constructor
    public Homework4() {
        this.numPages = 0;
        this.type = "none";
    }

    // Abstract Assignment Method
    public abstract void assign(int numPages);

    //compareTo Method
    public int compareTo(Homework4 o) {
        if(getNumPages() < o.getNumPages()) {
            return -1;
        } else if(getNumPages() == o.getNumPages()) {
            return 0;
        } else {
            return 1;
        }
    }


    // this.numPages Setter
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // this.numPages Getter
    public int getNumPages() {
        return numPages;
    }

    // this.type Setter
    public void setType(String type) {
        this.type = type;
    }

    // this.type Getter
    public String getType() {
        return type;
    }
}
