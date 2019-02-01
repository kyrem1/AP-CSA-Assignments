
/**
 * Write a description of class GameTerrainTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameTerrainTester
{
    public static void main(String[] args) {
        //Instantiate Terrains
        WinterMountain wmount = new WinterMountain(600, 400, 53, 12.34);
        Forest forest = new Forest(400, 300, 120);
        
        System.out.print(wmount.getName() + wmount.getTerrainSize() + wmount.getNum() + wmount.getTemperature() + "\n");
        System.out.print(forest.getName() + forest.getTerrainSize() + forest.getNum());
    }
}
