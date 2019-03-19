/**
 * <p>Client Class for Movie Object</p>
 *

 *
 * @author James Harbour
 * @version 3/19/19
 * //TODO add handling of descending vs ascending
 */
public class MovieTesterV2 {
    public static void main(String[] args) {
        Movie[] movies = {new Movie("Kimi no nai wa", 2015, "Makoto Shinkai"),
                            new Movie("Avengers: Infinity War", 2017, "Marvel"),
                            new Movie("Spirited Away", 1999, "Studio Ghibli"),
                            new Movie("Princess Mononoke", 2000, "Studio Ghibli"),
                            new Movie("Howl's Moving Castle", 2003, "Studio Ghibli"),
                            new Movie("The End of Evangelion", 2004, "Gainax Films"),
                            new Movie("Summer Wars", 2010, "Kyoto Animation"),
                            new Movie("Best Movie 420", 420, "I Don't Watch Movies: Animation"),
                            new Movie("Darling in the Franxx", 2018, "Trigger Animations"),
                            new Movie("Clannad: After Story", 2011, "Key Films")};
        sortTitle(movies, 1);
        printAll(movies);
        sortYear(movies, 1);
        printAll(movies);
        sortStudio(movies, 1);
        printAll(movies);
        sortTitle(movies, 2);
        printAll(movies);
        sortYear(movies, 2);
        printAll(movies);
        sortStudio(movies, 2);
        printAll(movies);
    }

    public static void printAll(Movie[] array) {
        System.out.printf("%-30s %4s   %-20s\n", "Title", "Year", "Studio");
        System.out.println("--------------------------------------------------------");
        for(Movie m : array) {
            System.out.println(m);
        }
    }

    /**
     * * Insertion Sort:
     *  *      For each element A[i], if A[i] > A[i+1], swap the elements until A[i] <= A[i+1]
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortTitle(Movie[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Movie x = a[i];
            int j = i - 1;
            while(j >= 0 && a[j].getTitle().compareTo(x.getTitle()) > 0) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }

    /**
     * * Insertion Sort:
     *  *      For each element A[i], if A[i] > A[i+1], swap the elements until A[i] <= A[i+1]
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortYear(Movie[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Movie x = a[i];
            int j = i - 1;
            while(j >= 0 && a[j].getYear() > x.getYear()) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }

    /**
     * * Insertion Sort:
     *  *      For each element A[i], if A[i] > A[i+1], swap the elements until A[i] <= A[i+1]
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortStudio(Movie[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Movie x = a[i];
            int j = i - 1;
            while(j >= 0 && a[j].getStudio().compareTo(x.getStudio()) > 0) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }



}
