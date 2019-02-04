
/**
 * Write a description of class WaterBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterBody extends Terrain
{
    private int volume;
    
    public WaterBody(int l, int w, int _volume)
    {
        super(l, w);
        volume = _volume;
    }
    
    public String getVolume() {
        return " and has " + String.format("%d", volume) + " Liters of water ";
    }

    
    public String getName() {
        return "Body of Water ";
    }
    
}
