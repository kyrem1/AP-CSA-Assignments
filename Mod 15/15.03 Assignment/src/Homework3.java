/**
 * <p>Abstract class defining Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public abstract class Homework3 implements Processing{
    // Instance Variables
    private int numPages;
    private String type;

    // Homework Constructor
    public Homework3() {
        this.numPages = 0;
        this.type = "none";
    }

    // Abstract Assignment Method
    public abstract void assign(int numPages);


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
