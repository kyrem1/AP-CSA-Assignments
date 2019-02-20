public class SomeClass implements Comparable<SomeClass> {
    private String city;
    private String state;

    public SomeClass(String city, String state) {
        this.city = city;
        this.state = state;
    }


    public String getCity()
    {
        return this.city;
    }

    public String getState()
    {
        return this.state;
    }

    public int compareTo(SomeClass obj)
    {
        // complete the code here
        if(this.state.compareTo(obj.getState()) < 0) {
            return -1;
        } else if(this.state.compareTo(obj.getState()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}