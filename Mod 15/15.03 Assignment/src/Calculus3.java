/**
 * <p>Calculus object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class Calculus3 extends Homework3 {

    public Calculus3() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("AP: Calculus BC");
    }

    public String toString() {
        return getType() + " - " + getNumPages() + " pages to read.";
    }

    @Override
    public void doHomework(int pagesRead) {
        setNumPages(getNumPages() - pagesRead);
    }
}
