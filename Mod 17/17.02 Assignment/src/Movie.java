/**
 * <p>Object encapsulates movie metadata</p>
 *
 * @author James Harbour
 * @version 3/19/19
 */
public class Movie {
    private int year;
    private String title;
    private String studio;

    public Movie(String title, int year, String studio) {
        this.studio = studio;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%-30s %4d   %-20s", title, year, studio);
    }
}
