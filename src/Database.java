import java.util.ArrayList;

public class Database {
    private final String FILE_PATH = "data/beers"; // TODO: 22/10/2021 get file name and type
    private final ArrayList<Beer> beers;

    public Database() {
        this.beers = getBeersFromFile();
        this.beers.add(new Beer(10, "A Beer", "Stout", 0.005));
    }

    public ArrayList<Beer> getAllbeers(){
       return beers;
    }

    private ArrayList<Beer> getBeersFromFile() {
        // TODO: 22/10/2021 add function to get beers from file
        return new ArrayList<>();
    }
}
