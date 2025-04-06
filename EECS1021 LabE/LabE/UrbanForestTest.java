import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UrbanForestTest {

    @Test
    void countTest() {
        final UrbanForest info;
        String filename = "treelist.csv";
        info = new UrbanForest(filename);
        assertEquals(info.treeCount(), 208929);
    }

    @Test
    void growTest() {
        final MunicipalTree myTree;
        String [] record = new String [] {"DECID","21","MISS","FLOWERING CRAB APPLE","-79.6174860021507","43.5100029400582"};
        myTree = new MunicipalTree(record);
        myTree.grow(2.2);
        assertEquals(Math.round(myTree.getDiameter()), 23.0);
    }

    @Test
    void getTreeTypesTest() throws IOException {

        final UrbanForest info;
        String filename = "treelist.csv";
        info = new UrbanForest(filename);

        final Set<String> types;
        try {
            types = info.getTreeTypes();
        } catch (InvalidTreeException e) {
            throw new RuntimeException(e);
        }
        int count = types.size();
        assertEquals(count, 252);
    }

    @Test
    void getTreeOwnerTest() throws IOException {

        final UrbanForest info;
        String filename = "treelist.csv";
        info = new UrbanForest(filename);

        final Map<String, Integer> treeCounts = info.getTreeOwners();
        Map<String, Integer> treeTrue = new HashMap<>();
        treeTrue.put("HYDRO", 59);
        treeTrue.put("MISS", 205199);
        treeTrue.put("MGS", 49);
        treeTrue.put("PEEL", 3388);
        treeTrue.put("BOUN", 171);
        treeTrue.put("PRIV", 63);

        for (String key : treeTrue.keySet()) {
            assertEquals(treeCounts.get(key), treeTrue.get(key));
        }

    }

}