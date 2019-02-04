
/**
 * Write a description of class StormyDesert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StormyDesert extends Desert
{
   private int windSpeed;
    
   public StormyDesert(int l, int w, int _temperature, int _windSpeed) {
       super(l, w, _temperature);
       windSpeed = _windSpeed;
   }
   
   public String getWindSpeed() {
       return " and a wind speed of " + String.format("%d", windSpeed) + " kilometers per hour ";
   }
   
   public String getName() {
       return "Stormy Desert ";
   }
   
}
