/**
 * This datatype represents a municipal tree.
 */
public class MunicipalTree {

    private final String type;
    private final String owner;
    private double diameter;
    private final String name;
    private final Location loc;

    /**
     * Make a Municipal Tree
     * 
     * @param record
     *            list of Strings that parameterize a tree. The parameters in the list are as follows:
     *            record[0] is its type (e.g. deciduous or coniferous)
     *            record[1] is its diameter in cm
     *            record[2] is its owner (e.g. Peel, Toronto, Mississauga)
     *            record[3] is its botanical name
     *            record[4] and record[5] are the longitude and latitude coords of its location
     */
    public MunicipalTree(String[] record) {
        this.type = record[0];
        this.diameter = Double.parseDouble(record[1]);
        this.owner = record[2];
        this.name = record[3];
        this.loc = new Location(Float.parseFloat(record[4]), Float.parseFloat(record[5]));
    }

    /*
     * Useful getter and setter methods
     */
    public String getType() {
        return type;
    }
    public String getOwner() {
        return owner;
    }
    public double getDiameter() { return diameter;}
    public String getName() {
        return name;
    }
    public Location getLoc() {
        return loc;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /*
     * @see Object.toString()
     */
    @Override
    public String toString() {
        return "(" + this.getType()
                + ", " + this.getName()
                + ", " + this.getLoc()
                + ") " + this.getDiameter();
    }

    /**
     * Make the tree GROW
     * Assume that a tree's diameter will INCREASE
     * by 5% every year.  More specifically, assume
     * that for any tree:
     * new_diameter = old_diameter + old_diameter*0.05*elapsed_time
     *
     * @param time the amount of time that has elapsed, in years.
     */
    public void grow(double time) {
        this.diameter = this.diameter + this.diameter*.05*time; //replace this with your code!
    }
}
