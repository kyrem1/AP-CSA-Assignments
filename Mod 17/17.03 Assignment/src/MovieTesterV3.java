/**
 * <p>Client Class for Movie Object
 *      Implements Various Selection Sort
 *      Methods on array of Movies</p>
 *
 * Pseudo-code:
 * Step 1 − Set MIN to location 0
 * Step 2 − Search the minimum element in the list
 * Step 3 − Swap with value at location MIN
 * Step 4 − Increment MIN to point to next element
 * Step 5 − Repeat until list is sorted
 * (Source: https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm)
 *
 * @author James Harbour
 * @version 3/19/19
 */
public class MovieTesterV3 {
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
        System.out.println("Original List");
        printAll(movies);
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
        System.out.print("\n");
    }

    /**
     * <p>Swaps a[i1] and a[i2]</p>
     *
     * @param a Insert Array with elements to swap
     * @param i1 index of element
     * @param i2 index of element
     */
    public static void swap(Movie[] a, int i1, int i2) {
        if(i1 != i2) {
            Movie tempMovie = a[i1];
            a[i1] = a[i2];
            a[i2] = tempMovie;
        }
    }

    /**
     * <p>Selection Sort: by Title</p>
     * * Step 1 − Set MIN to location 0
     *  * Step 2 − Search the minimum element in the list
     *  * Step 3 − Swap with value at location MIN
     *  * Step 4 − Increment MIN to point to next element
     *  * Step 5 − Repeat until list is sorted
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortTitle(Movie[] a, int direction) {
        String dir;
        if(direction == 1) {
            dir = "ascending";
        } else {
            dir = "descending";
        }
        System.out.printf("Algorithm: Selection Sort | By Title | Direction: %s\n", dir);
        int min;
        if(direction == 1) {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getTitle().compareTo(a[min].getTitle()) < 0) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        } else {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getTitle().compareTo(a[min].getTitle()) > 0) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        }


    }

    /**
     * <p>Selection Sort: by Year</p>
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortYear(Movie[] a, int direction) {
        String dir;
        if(direction == 1) {
            dir = "ascending";
        } else {
            dir = "descending";
        }
        System.out.printf("Algo: Selection Sort | By Year | Direction: %s\n", dir);
        int min;
        if(direction == 1) {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getYear() < a[min].getYear()) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        } else {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getYear() > a[min].getYear()) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        }
    }

    /**
     * <p>Selection Sort: by Studio</p>
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortStudio(Movie[] a, int direction) {
        String dir;
        if(direction == 1) {
            dir = "ascending";
        } else {
            dir = "descending";
        }
        System.out.printf("Algo: Selection Sort | By Studio | Direction: %s\n", dir);
        int min;
        if(direction == 1) {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getStudio().compareTo(a[min].getStudio()) < 0) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        } else {
            for(int i = 0; i < a.length - 1; i++) {
                min = i;
                for(int j = i + 1; j < a.length; j++) {
                    if(a[j].getStudio().compareTo(a[min].getStudio()) > 0) {
                        min = j;
                    }
                }
                if(min != i) {
                    swap(a, min, i);
                }
            }
        }
    }



}
