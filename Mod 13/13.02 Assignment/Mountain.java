
/**
 * Write a description of class Mountain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mountain extends Terrain
{   
    private int numMountains;
    
    public Mountain(int l, int w, int _numMountains) {
        super(l, w);
        numMountains = _numMountains;
    }
    
     public String getNum() {
        return " and has " + String.format("%d", numMountains) + " mountains";
    }

    
    public String getName() {
        return "Mountain ";
    }
}
