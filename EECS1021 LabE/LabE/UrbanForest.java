import java.io.IOException;
import java.util.*;

/**
 * Forest consists of methods that maintain and extract information lists of municipal trees.
 *
 * Don't change the method signatures and specifications; just implement the method bodies.
 * You may add your own public or private methods or classes.
 */
public class UrbanForest extends TimerTask {
    private List<MunicipalTree> trees = new ArrayList<>();

    /**
     * Create a Forest Object from a file of trees.
     *
     * @param filename	The file we will read from
     */
    public UrbanForest(String filename)  {
        try {
            this.trees = TreeReader.importData(filename);
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
        }
    }

    /**
     * @return the Trees in our urban forest
     */
    public List<MunicipalTree> getTrees() {
        return this.trees;
    }

    /**
     * @return the number of Trees in our urban forest
     */
    public int treeCount() {
        //replace the line below with your code!
       return this.trees.size();
    }

    /**
     * Calculate the AVERAGE DIAMETER across
     * every tree in the Urban Forest.
     *
     * @return the AVERAGE DIAMETER of the trees in our tree list
     */
    public double averageDiameter() {
        //replace the line below with your code!
       double totalDiameter = 0;
        for(MunicipalTree nt:trees){
            totalDiameter += nt.getDiameter();
        }
        return totalDiameter/treeCount();
    }

    /**
     * Get all the Botanical Names mentioned in a list of municipal trees.
     *
     * @throws InvalidTreeException if ANY TREE NAME BEGINS WITH Z.
     *
     * @return a **Set** of Botanical Names that are represented in the list of trees.
     *         Botanical Names are case-insensitive, and the returned set may
     *         include each Botanical Name ***at most once***.
     */
    public Set<String> getTreeTypes() throws InvalidTreeException {
        //replace the line below with your code!
        Set<string> unique = new Hashset();
        for(MunicipalTree nt:trees){
            String name = nt.getName();
            if(name.chatAt(0) == 'Z' || name.charAt(0) == 'z'){
                throw new InvalidTreeException(name);
            }
                unique.add(name);
        }return unique;
    }

    /**
     * Get the number of trees owned and maintained by each municipal region (e.g. Peel, Mississauga, Toronto Hydro).
     *
     * @return a Map of Key-Value pairs where keys are municipal regions (e.g. Peel, Mississauga, Toronto Hydro)
     * and values are counts of the number of trees maintained by that particular region.
     */
    public Map<String, Integer> getTreeOwners() {
        //replace the line below with your code!
       Map<String, Integer> hw = new HashMap<>();
        for(MunicipalTree nt : trees){
            String name = nt.getOwner();
            if(hw.containsKey(name)){
                hw.get(name, hw.get(name)=1);
            }else {
                hw.put(name,1);}
        }return hw;
            
    }


    /**
     * Simulate GROWTH of the urban forest over a year's time.
     * This method should cycle thru every tree in the forest
     * and make each tree GROW for a total of ONE YEAR.
     * This method is INHERITED from the TIMERTASK class
     */
    @Override
    public void run() {

        //Write a loop to make each tree in the forest grow
        //for a year below.
    for(MunicipalTree nt : trees){
             nt.growr(1);

        //Keep the line below.
        //You should see the average diametexwr change
        //if you are simulating correctly.
        System.out.println("The average tree diameter is now: " + averageDiameter());
    }
}
