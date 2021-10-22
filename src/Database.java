import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final String FILE_PATH = "data/beers.csv"; // TODO: 22/10/2021 get file name and type
    private final ArrayList<Beer> beers;

    public Database() {
        this.beers = getBeersFromFile();
        this.beers.add(new Beer("A Beer", "Stout", 0.5));
    }

    private ArrayList<Beer> getBeersFromFile() {
        // TODO: 22/10/2021 add function to get beers from file
        return new ArrayList<>();
    }

    public void addBeer(String name, String type, double alc) {
        beers.add(new Beer(name, type, alc));
    }

    public void saveToFile() throws FileNotFoundException {
        File file = new File(FILE_PATH);
        PrintStream ps = new PrintStream(file);
        ps.println("name;type;alc");

        for (Beer beer : beers) {
            ps.println(beer.getName() + ";" +  beer.getType() + ";" +  beer.getAlc());
        }
    }

    public List<Beer> getAllbeers(){
        return beers;
    }
}
