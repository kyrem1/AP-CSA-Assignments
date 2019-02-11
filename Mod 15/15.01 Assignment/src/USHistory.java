/**
 * <p>US History object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class USHistory extends Homework {

    public USHistory() {
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
