/**
 * <p>Client class for music object. Implements various Sequential
 * Search Algorithms on an array of music objects.</p>
 *
 * @author James Harbour
 */
public class MusicTesterV2 {
    public static void main(String[] args) {
        String[] titles = {"Xenogenesis",
                            "Monody",
                            "MAYDAY",
                            "Windfall",
                            "Continue",
                            "The Journey",
                            "Vagrant",
                            "Horizons",
                            "Hold On",
                            "ILY"};

        String[] artists = {"TheFatRat",
                            "TheFatRat",
                            "TheFatRat",
                            "TheFatRat",
                            "Virtual Riot",
                            "Feint",
                            "Feint",
                            "Feint",
                            "Panda Eyes",
                            "Panda Eyes"};
        int[] years = {2011,
                        2012,
                        2013,
                        2011,
                        2007,
                        2012,
                        2015,
                        2019,
                        2012,
                        2017};
        Music[] mArr = new Music[10];
        for(int i = 0; i < mArr.length; i++) {
            mArr[i] = new Music(titles[i], years[i], artists[i]);
        }
        System.out.println("Original Array");
        printAll(mArr);

        sortTitle(mArr, 1);
        findTitle(mArr, "ILY");
        findTitle(mArr, "EasyPZ");

        sortYear(mArr, 1);
        findYear(mArr, 2012);
        findYear(mArr, 1111);

        sortArtist(mArr, 1);
        findArtist(mArr, "TheFatRat");
        findArtist(mArr, "TheZapper");


    }

    public static void printAll(Music[] a) {
        System.out.printf( "%-25s %4s   %-20s \n", "Title",  "Year" , "Artist");
        System.out.println("----------------------------------------------");
        for(Music m : a) {
            System.out.println(m);
        }
        System.out.print("\n");
    }

    public static void findTitle(Music[] a, String title) {
        System.out.printf("\n<< Searching for song with title %s >>\n", title);

        boolean isFound = false;
        int left = 0;
        int right = a.length - 1;
        while(left <= right) {
            int m = (left + right) / 2;
            if(a[m].getTitle().compareTo(title) < 0) {
                left = m + 1;
            } else if(a[m].getTitle().compareTo(title) > 0) {
                right = m - 1;
            } else {
                left = m;
                isFound = true;
                break;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found song with title %s\n", title);
            linearPrintTitle(a, left, title);
        } else {
            System.out.printf("Failure: Did not find song with title %s\n", title);
        }

    }

    /**
     * *function binary_search(A, n, T):
     *      *     L := 0
     *      *     R := n − 1
     *      *     while L <= R:
     *      *         m := floor((L + R) / 2)
     *      *         if A[m] < T:
     *      *             L := m + 1
     *      *         else if A[m] > T:
     *      *             R := m - 1
     *      *         else:
     *      *             return m
     *      *     return unsuccessful
     * @param a Array to Search
     * @param year Song release year to search for
     */
    public static void findYear(Music[] a, int year) {
        System.out.printf("\n<< Searching for song(s) with year %d >>\n", year);

        boolean isFound = false;

        int left = 0;
        int right = a.length - 1;
        while(left <= right) {
            int m = (left + right) / 2;
            if(a[m].getYear() < year) {
                left = m + 1;
            } else if(a[m].getYear() > year) {
                right = m - 1;
            } else {
                left = m;
                isFound = true;
                break;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found song(s) with year %d\n", year);
            linearPrintYear(a, left, year);
        } else {
            System.out.printf("Failure: Did not find song with year %d\n", year);
        }

    }

    public static void findArtist(Music[] a, String artist) {
        System.out.printf("\n<< Searching for song(s) with artist %s >>\n", artist);

        boolean isFound = false;

        int left = 0;
        int right = a.length - 1;
        while(left <= right) {
            int m = (left + right) / 2;
            if(a[m].getArtist().compareTo(artist) < 0) {
                left = m + 1;
            } else if(a[m].getArtist().compareTo(artist) > 0) {
                right = m - 1;
            } else {
                left = m;
                isFound = true;
                break;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found song(s) with artist %s\n", artist);
            linearPrintArtist(a, left, artist);
        } else {
            System.out.printf("Failure: Did not find song with artist %s\n", artist);
        }

    }

    public static void linearPrintTitle(Music[] r, int low, String title) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low;
        while(r[i].getTitle().equals(title))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low;
        while(r[i].getTitle().equals(title))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println("\t" + r[i]);
    }

    public static void linearPrintYear(Music[] r, int low, int year) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low;
        while(r[i].getYear() == year)
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low;
        while(r[i].getYear() == year)
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println("\t" + r[i]);
    }

    public static void linearPrintArtist(Music[] r, int low, String artist) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low;
        while(r[i].getArtist().equals(artist))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low;
        while(r[i].getArtist().equals(artist))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println("\t" + r[i]);
    }

    /**
     * * Insertion Sort:
     *  *      For each element A[i], if A[i] > A[i+1], swap the elements until A[i] <= A[i+1]
     *
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortTitle(Music[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Music x = a[i];
            int j = i - 1;
            if (direction == 1) {
                while (j >= 0 && a[j].getTitle().compareTo(x.getTitle()) > 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            } else if (direction == 2) {
                while (j >= 0 && a[j].getTitle().compareTo(x.getTitle()) < 0) {
                    a[j + 1] = a[j];
                    j--;
                }
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
    public static void sortYear(Music[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Music x = a[i];
            int j = i - 1;
            if(direction == 1) {
                while (j >= 0 && a[j].getYear() > x.getYear()) {
                    a[j + 1] = a[j];
                    j--;
                }
            } else if(direction == 2) {
                while (j >= 0 && a[j].getYear() < x.getYear()) {
                    a[j + 1] = a[j];
                    j--;
                }
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
    public static void sortArtist(Music[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Music x = a[i];
            int j = i - 1;
            if(direction == 1) {
                while (j >= 0 && a[j].getArtist().compareTo(x.getArtist()) > 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            } else if(direction == 2) {
                while (j >= 0 && a[j].getArtist().compareTo(x.getArtist()) < 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            }
            a[j+1] = x;
        }
    }

}
