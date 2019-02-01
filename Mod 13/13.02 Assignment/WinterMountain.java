
/**
 * Write a description of class WinterMountain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinterMountain extends Mountain
{
    private double temperature;
    
    public WinterMountain(int l, int w, int _numMountains, double _temperature)
    {
        super(l, w, _numMountains);
        temperature = _temperature;
    }
    
    public String getTemperature() {
        return " and temperature of " + String.format("%4.2f", temperature) + " degrees";
    }
    
    public String getName() {
        return "Winter Mountain ";
    }
}
