import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TreeReader {

    /**
     * Get a list of trees from a csv file
     *
     * @param filename Name of the file to read
     * @return a list of trees retrieved from the file.
     * @throws IOException if the filename is invalid.
     */
    public static List<MunicipalTree> importData(String filename) throws IOException {

        String line = "";
        int count = 0;
        List<MunicipalTree> trees = new ArrayList<>();

        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                count += 1;
                if (count == 1) continue;
                String[] record = line.split(",");    // use comma as separator
                trees.add(new MunicipalTree(record));

            }
            return trees;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
