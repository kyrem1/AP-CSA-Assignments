/**
 * <p>English object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class English extends Homework {

    public English() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("English");
    }

    public String toString() {
        return getType() + " - read " + getNumPages() + " pages.";
    }
}
