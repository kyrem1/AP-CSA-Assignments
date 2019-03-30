/**
 * <p>Client Class for Movie Object
 *      Implements Various Merge Sort
 *      Methods on array of Movies</p>
 *
 * Pseudo-code:
 * MergeSort(arr[], l,  r)
 *      0. If l == r:
 *              return
 *      1. Find the middle point to divide the array into two halves:
 *              middle m = (l+r)/2
 *      2. Call mergeSort for first half:
 *              Call mergeSort(arr, l, m)
 *      3. Call mergeSort for second half:
 *              Call mergeSort(arr, m+1, r)
 *      4. Merge the two halves sorted in step 2 and 3:
 *              Call merge(arr, l, m, r)
 * (Sources for above pseudo-code:
 *           1. https://www.geeksforgeeks.org/merge-sort/
 *           2. https://brilliant.org/wiki/merge/
 *           3. Self made modifications for Movie object)
 *
 * @author James Harbour
 * @version 3/30/19
 */
public class MovieTesterV4 {
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

        System.out.println("Algorithm: Merge Sort | By Title | Direction: ascending");
        sortTitle(movies, 0, movies.length - 1);
        printAll(movies);
        System.out.println("Algorithm: Merge Sort | By Year | Direction: ascending");
        sortYear(movies, 0, movies.length - 1);
        printAll(movies);
        System.out.println("Algorithm: Merge Sort | By Studio | Direction: ascending");
        sortStudio(movies, 0, movies.length - 1);
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
     * <p>Merge Sort: by Title</p>
     *
     * @param a Insert Array to be sorted
     */
    public static void sortTitle(Movie[] a, int low, int high) {
        if(low == high) {
            return;
        }

        int mid = (low + high) / 2;
        sortTitle(a, low, mid);
        sortTitle(a, mid + 1, high);

        mergeTitle(a, low, mid, high);
    }

    /**
     * <p>Merge Sort: by Year</p>
     *
     * @param a Insert Array to be sorted
     */
    public static void sortYear(Movie[] a, int low, int high) {
        if(low == high) {
            return;
        }

        int mid = (low + high) / 2;
        sortYear(a, low, mid);
        sortYear(a, mid + 1, high);

        mergeYear(a, low, mid, high);
    }

    /**
     * <p>Merge Sort: by Studio</p>
     *
     * @param a Insert Array to be sorted
     */
    public static void sortStudio(Movie[] a, int low, int high) {
        if(low == high) {
            return;
        }

        int mid = (low + high) / 2;
        sortStudio(a, low, mid);
        sortStudio(a, mid + 1, high);

        mergeStudio(a, low, mid, high);
    }

    public static void mergeTitle(Movie[] a, int low, int mid, int high) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        Movie[] left = new Movie[leftLength];
        Movie[] right = new Movie[rightLength];

        for(int i = 0; i < leftLength; i++) {
            left[i] = a[i + low];
        }
        for(int i = 0; i < rightLength; i++) {
            right[i] = a[i + mid + 1];
        }

        // Comparison Part
        int i = 0, j = 0, k = low;
        while (i < leftLength && j < rightLength) {
            if (left[i].getTitle().compareTo(right[j].getTitle()) <= 0) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++; }
            k++;
        }

        // Make Sure Everything has copied over after comparisons
        while(i < leftLength) {
            a[k] = left[i];
            i++;
            k++;
        }
        while(j < rightLength) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeYear(Movie[] a, int low, int mid, int high) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        Movie[] left = new Movie[leftLength];
        Movie[] right = new Movie[rightLength];

        for(int i = 0; i < leftLength; i++) {
            left[i] = a[i + low];
        }
        for(int i = 0; i < rightLength; i++) {
            right[i] = a[i + mid + 1];
        }

        // Comparison Part
        int i = 0, j = 0, k = low;
        while (i < leftLength && j < rightLength) {
            if (left[i].getYear() <= right[j].getYear()) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++; }
            k++;
        }

        // Make Sure Everything has copied over after comparisons
        while(i < leftLength) {
            a[k] = left[i];
            i++;
            k++;
        }
        while(j < rightLength) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeStudio(Movie[] a, int low, int mid, int high) {
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        Movie[] left = new Movie[leftLength];
        Movie[] right = new Movie[rightLength];

        for(int i = 0; i < leftLength; i++) {
            left[i] = a[i + low];
        }
        for(int i = 0; i < rightLength; i++) {
            right[i] = a[i + mid + 1];
        }

        // Comparison Part
        int i = 0, j = 0, k = low;
        while (i < leftLength && j < rightLength) {
            if (left[i].getStudio().compareTo(right[j].getStudio()) <= 0) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++; }
            k++;
        }

        // Make Sure Everything has copied over after comparisons
        while(i < leftLength) {
            a[k] = left[i];
            i++;
            k++;
        }
        while(j < rightLength) {
            a[k] = right[j];
            j++;
            k++;
        }
    }





}
