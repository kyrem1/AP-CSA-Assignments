import java.util.ArrayList;

/**
 * <p>Client class for contact object. Tests a contact list
 * search functions</p>
 *
 * @author James Harbour
 * @version 4/10/19
 */
public class ContactTester {
    public static void main(String[] args) {
        String[] names = {"Ellen",
                "Vivian",
                "Jack",
                "George",
                "Vincent",
                "Denice",
                "Raine",
                "Reeve",
                "Evelyn",
                "Jeremy"};


        String[] relations = {"aunt",
                "aunt",
                "grandfather",
                "cousin",
                "friend",
                "cousin",
                "friend",
                "aunt",
                "grandmother",
                "friend"};

        String[] birthdays = {"Jan. 7, 2020",
                "Dec. 1, 2000",
                "Apr. 12, 2003",
                "Dec. 6, 2012",
                "Sep. 17, 2007",
                "Dec. 6, 2012",
                "May 29, 2009",
                "Jul. 5, 2017",
                "Oct. 9, 2016",
                "Aug. 21, 2000"};

        String[] phones = {"(760) 457-5481",
                "(249) 793-2134",
                "(357) 679-0541",
                "(556) 521-9738",
                "(250) 341-4042",
                "(239) 823-6104",
                "(262) 279-6614",
                "(400) 770-0025",
                "(302) 676-4999",
                "(207) 581-6188"};

        String[] emails = {"smcnabb@comcast.net",
                "credmond@optonline.net",
                "loscar@yahoo.com",
                "barnett@hotmail.com",
                "cameron@outlook.com",
                "sonnen@att.net",
                "cameron@outlook.com",
                "mthurn@outlook.com",
                "pajas@yahoo.com",
                "cameron@outlook.com"};

        Contact[] contacts = new Contact[10];
        for(int i = 0; i < names.length; i++) {
            contacts[i] = new Contact(names[i], relations[i], birthdays[i], phones[i], emails[i]);
        }

        System.out.println("Original List:\n");
        printAll(contacts);

        sortName(contacts, 1);
        findName(contacts, "Jack");
        findName(contacts, "Zilean");

        sortRelation(contacts, 1);
        findRelation(contacts, "friend");
        findRelation(contacts, "son");

        findBirthday(contacts, "Jul");
        findBirthday(contacts, "Mar");

        findPhone(contacts, "(249) 793-2134");
        findPhone(contacts, "(111) 111-1111");

        findEmail(contacts, "cameron@outlook.com");
        findEmail(contacts, "nope@no.com");


    }

    public static void printAll(Contact[] a) {
        System.out.printf("%15s\t|\t%15s\t|\t%15s\t|\t%12s\t|\t%18s\n", "name", "relation", "birthday", "phone number", "email");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for(Contact c : a) {
            System.out.println(c);
        }
    }

    /**
     * * Insertion Sort:
     *  *      For each element A[i], if A[i] > A[i+1], swap the elements until A[i] <= A[i+1]
     *  Sorts by Name
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortName(Contact[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Contact x = a[i];
            int j = i - 1;
            if (direction == 1) {
                while (j >= 0 && a[j].getName().compareTo(x.getName()) > 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            } else if (direction == 2) {
                while (j >= 0 && a[j].getName().compareTo(x.getName()) < 0) {
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
     *  Sorts by Relation
     * @param a Insert Array to be sorted
     * @param direction 1 sort ascending, 2 sort descending
     */
    public static void sortRelation(Contact[] a, int direction) {
        for(int i = 1; i < a.length; i++) {
            Contact x = a[i];
            int j = i - 1;
            if (direction == 1) {
                while (j >= 0 && a[j].getRelation().compareTo(x.getRelation()) > 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            } else if (direction == 2) {
                while (j >= 0 && a[j].getRelation().compareTo(x.getRelation()) < 0) {
                    a[j + 1] = a[j];
                    j--;
                }
            }
            a[j+1] = x;
        }
    }

    public static void findName(Contact[] a, String name) {
        System.out.printf("\n<< Searching for contact with Name %s >>\n", name);

        boolean isFound = false;
        int left = 0;
        int right = a.length - 1;
        while(left <= right) {
            int m = (left + right) / 2;
            if(a[m].getName().compareTo(name) < 0) {
                left = m + 1;
            } else if(a[m].getName().compareTo(name) > 0) {
                right = m - 1;
            } else {
                left = m;
                isFound = true;
                break;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found contact with Name %s\n", name);
            linearPrintName(a, left, name);
        } else {
            System.out.printf("Failure: Did not find contact with Name %s\n", name);
        }
    }

    public static void linearPrintName(Contact[] r, int low, String name) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low;
        while(r[i].getName().equals(name))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low;
        while(r[i].getName().equals(name))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println("\t" + r[i]);
    }

    public static void findRelation(Contact[] a, String relation) {
        System.out.printf("\n<< Searching for contact(s) with Relation %s >>\n", relation);

        boolean isFound = false;
        int left = 0;
        int right = a.length - 1;
        while(left <= right) {
            int m = (left + right) / 2;
            if(a[m].getRelation().compareTo(relation) < 0) {
                left = m + 1;
            } else if(a[m].getRelation().compareTo(relation) > 0) {
                right = m - 1;
            } else {
                left = m;
                isFound = true;
                break;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found contact(s) with Relation %s\n", relation);
            linearPrintRelation(a, left, relation);
        } else {
            System.out.printf("Failure: Did not find contact with Relation %s\n", relation);
        }
    }

    public static void linearPrintRelation(Contact[] r, int low, String relation) {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low;
        while(r[i].getRelation().equals(relation))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low;
        while(r[i].getRelation().equals(relation))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println("\t" + r[i]);
    }


    public static void findBirthday(Contact[] a, String month) {
        System.out.printf("\n<< Searching for contact(s) with Birthday Month %s >>\n", month);

        boolean isFound = false;
        ArrayList<Integer> indeces = new ArrayList<Integer>(0);
        for(int i = 0; i < a.length; i++) {
            if(a[i].getBirthday().substring(0, 3).equals(month)) {
                indeces.add(i);
                isFound = true;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found %d contact(s) with Birthday Month %s\n", indeces.size(), month);
            for(Integer i : indeces) {
                System.out.println("\t" + a[i]);
            }
        } else {
            System.out.printf("Failure: Did not find contact with Birthday Month %s in collection\n", month);
        }

    }

    public static void findPhone(Contact[] a, String phone) {
        System.out.printf("\n<< Searching for contact(s) with phone number %s >>\n", phone);

        boolean isFound = false;
        ArrayList<Integer> indeces = new ArrayList<Integer>(0);
        for(int i = 0; i < a.length; i++) {
            if(a[i].getPhonenum().equals(phone)) {
                indeces.add(i);
                isFound = true;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found %d contact(s) with phone number %s\n", indeces.size(), phone);
            for(Integer i : indeces) {
                System.out.println("\t" + a[i]);
            }
        } else {
            System.out.printf("Failure: Did not find contact with phone number %s in collection\n", phone);
        }

    }

    public static void findEmail(Contact[] a, String email) {
        System.out.printf("\n<< Searching for contact(s) with email %s >>\n", email);

        boolean isFound = false;
        ArrayList<Integer> indeces = new ArrayList<Integer>(0);
        for(int i = 0; i < a.length; i++) {
            if(a[i].getEmail().equals(email)) {
                indeces.add(i);
                isFound = true;
            }
        }

        if(isFound) {
            System.out.printf("Success: Found %d contact(s) with email %s\n", indeces.size(), email);
            for(Integer i : indeces) {
                System.out.println("\t" + a[i]);
            }
        } else {
            System.out.printf("Failure: Did not find contact with email %s in collection\n", email);
        }

    }
}
