/**
 * <p>US History object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class USHistory3 extends Homework3 {

    public USHistory3() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("US History");
    }

    public String toString() {
        return getType() + " - read " + getNumPages() + " pages.";
    }
}
