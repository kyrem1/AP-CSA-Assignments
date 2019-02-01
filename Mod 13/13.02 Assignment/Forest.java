
/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends Terrain
{
    private int numTrees;
    
    public Forest(int l, int w, int _numTrees)
    {
        super(l, w);
        numTrees = _numTrees;
    }
    
    public String getNum() {
        return " and has " + String.format("%d", numTrees) + " trees";
    }
    
    public String getName() {
        return "Forest ";
    }

}
