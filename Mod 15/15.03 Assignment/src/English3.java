/**
 * <p>English object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class English3 extends Homework3 {

    public English3() {
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
