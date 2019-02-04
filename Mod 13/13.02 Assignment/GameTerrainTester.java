
/**
 * The implementation class of the Terrain class heiarchy.
 * 
 * @author James Harbour 
 * @version 2/4/19
 */
public class GameTerrainTester
{
    public static void main(String[] args) {
        //Instantiate Terrains
        Mountain mount = new Mountain(600, 400, 53);
        WinterMountain wmount = new WinterMountain(600, 400, 53, 12.34);
        Forest forest = new Forest(400, 300, 120);
        WaterBody wbody = new WaterBody(302, 456, 12523);
        LakeSystem lakes = new LakeSystem(530, 600, 123045, 12);
        Desert desert = new Desert(1234, 567, 89);
        StormyDesert sdesert = new StormyDesert(300, 300, 105, 30);
        
        System.out.println(mount.getName() + mount.getTerrainSize() + mount.getNum() + "\n");
        System.out.println(wmount.getName() + wmount.getTerrainSize() + wmount.getNum() + wmount.getTemperature() + "\n");
        System.out.println(forest.getName() + forest.getTerrainSize() + forest.getNum() + "\n");
        System.out.println(wbody.getName() + wbody.getTerrainSize() + wbody.getVolume() + "\n");
        System.out.println(lakes.getName() + lakes.getTerrainSize() + lakes.getVolume() + lakes.getNumLakes() + "\n");
        System.out.println(desert.getName() + desert.getTerrainSize() + desert.getTemperature() + "\n");
        System.out.println(sdesert.getName() + sdesert.getTerrainSize() + sdesert.getTemperature() + sdesert.getWindSpeed() + "\n");
    }
}
