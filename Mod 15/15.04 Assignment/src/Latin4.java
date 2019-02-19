/**
 * <p>Latin object, extends Homework</p>
 *
 * @author James Harbour
 * @version 2/11/19
 */

public class Latin4 extends Homework4 {

    public Latin4() {
        super();
    }

    @Override
    public void assign(int numPages) {
        setNumPages(numPages);
        setType("Latin");
    }

    public String toString() {
        return getType() + " - " + getNumPages() + " pages to read.";
    }


    @Override
    public void doHomework(int pagesRead) {
        setNumPages(getNumPages() - pagesRead);
    }

}
