
/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desert extends Terrain
{
    private int temperature;
    
    public Desert(int l, int w, int _temperature)
    {
        super(l, w);
        temperature = _temperature;
    }

    public String getTemperature() {
        return " and temperature of " + String.format("%d", temperature) + " degrees";
    }

    
    public String getName() {
        return "Desert ";
    }   
}
