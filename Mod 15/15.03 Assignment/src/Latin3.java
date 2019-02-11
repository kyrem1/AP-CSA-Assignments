/**
 * <p>Latin object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class Latin3 extends Homework3{

    public Latin3() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("Latin");
    }

    public String toString() {
        return getType() + " - read " + getNumPages() + " pages.";
    }
}
