import java.util.ArrayList;

/**
 * <p>Client class for music object. Implements various Sequential
 * Search Algorithms on an array of music objects.</p>
 *
 * @author James Harbour
 */
public class MusicTesterV1 {
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

        findTitle(mArr, "ILY");
        findTitle(mArr, "EasyPZ");
        findYear(mArr, 2012);
        findYear(mArr, 1111);
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
        int index = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i].getTitle().equals(title)) {
                index = i;
                isFound = true;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found song with title %s in collection at position %d\n", title, index);
            System.out.println("\t" + a[index]);
        } else {
            System.out.printf("Failure: Did not find song with title %s in collection\n", title);
        }

    }

    public static void findYear(Music[] a, int year) {
        System.out.printf("\n<< Searching for song(s) with year %d >>\n", year);

        boolean isFound = false;
        ArrayList<Integer> indeces = new ArrayList<Integer>(0);
        for(int i = 0; i < a.length; i++) {
            if(a[i].getYear() == year) {
                indeces.add(i);
                isFound = true;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found %d song(s) with year %d\n", indeces.size(), year);
            for(Integer i : indeces) {
                System.out.println("\t" + a[i]);
            }
        } else {
            System.out.printf("Failure: Did not find song with year %d in collection\n", year);
        }

    }

    public static void findArtist(Music[] a, String artist) {
        System.out.printf("\n<< Searching for song(s) with artist %s >>\n", artist);

        boolean isFound = false;
        ArrayList<Integer> indeces = new ArrayList<Integer>(0);
        for(int i = 0; i < a.length; i++) {
            if(a[i].getArtist().equals(artist)) {
                indeces.add(i);
                isFound = true;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found %d song(s) with artist %s\n", indeces.size(), artist);
            for(Integer i : indeces) {
                System.out.println("\t" + a[i]);
            }
        } else {
            System.out.printf("Failure: Did not find song with artist %s in collection\n", artist);
        }

    }

}
