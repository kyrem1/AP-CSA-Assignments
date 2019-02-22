public class Tool implements Product, Comparable<Tool> {
    private String name;
    private double cost;

    /**
     * <p>Tool Constructor</p>
     * @param name  Name of Tool
     * @param cost  Cost of Tool
     */
    public Tool(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    //TODO CHECKME with TEST
    @Override
    public int compareTo(Tool tool) {
        if(this.cost < tool.getCost()) {
            return -1;
        } else if(this.cost == tool.getCost()) {
            return 0;
        } else {
            return 1;
        }
    }
}
