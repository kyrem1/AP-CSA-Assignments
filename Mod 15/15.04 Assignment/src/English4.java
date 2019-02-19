/**
 * <p>English object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class English4 extends Homework4 {

    public English4() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("English");
    }

    public String toString() {
        return getType() + " - " + getNumPages() + " pages to read.";
    }

    @Override
    public void doHomework(int pagesRead) {
        setNumPages(getNumPages() - pagesRead);
    }

}
