
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
        ArrayList< Integer > a = new ArrayList ();
        int value;
        a.add(4);
        a.add(5);
        a.add(new Integer(6));
        value = a.size();
        System.out.println(value);
    }
}
