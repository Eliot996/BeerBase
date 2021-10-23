import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private final String FILE_PATH = "data/beers.csv";
    private final ArrayList<Beer> beers;

    public Database() {
        this.beers = new ArrayList<>();
        getBeersFromFile();
        this.beers.add(new Beer("A Beer", "Stout", 0.5));
    }

    private void getBeersFromFile() {
        try {
            Scanner load = new Scanner(new File(FILE_PATH));
            while(load.hasNextLine()){
                beers.add(new Beer(load.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addBeer(String name, String type, double alc) {
        beers.add(new Beer(name, type, alc));
    }

    public void saveToFile() throws FileNotFoundException {
        File file = new File(FILE_PATH);
        PrintStream ps = null;
        try {
            ps = new PrintStream(file, StandardCharsets.UTF_8);
            for (Beer beer : beers) {
                ps.println(beer.getCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Beer> getAllbeers(){
        return beers;
    }
}
