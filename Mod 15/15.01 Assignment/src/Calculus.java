/**
 * <p>Calculus object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class Calculus extends Homework {

    public Calculus() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("AP: Calculus BC");
    }

    public String toString() {
        return getType() + " - read " + getNumPages() + " pages.";
    }
}
