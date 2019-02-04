
/**
 * Write a description of class LakeSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LakeSystem extends WaterBody
{
    private int numLakes;
    
    public LakeSystem(int l, int w, int _volume, int _numLakes)
    {
        super(l, w, _volume);
        numLakes = _numLakes;
    }

    public String getNumLakes() {
        return "and has " + String.format("%d", numLakes) + " lakes in it";
    }
    
    public String getName() {
        return "System of Lakes ";
    }
}
