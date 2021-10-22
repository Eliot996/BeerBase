import java.io.FileNotFoundException;
import java.util.List;

public class BeerBase {
    private UserInterface ui = new UserInterface(this);// <- dependency injection
    private Database db = new Database();

    public void run(){
        ui.run();
    }

    public static void main(String[] args) {
        new BeerBase().run();
    }

    public List<Beer> getAllBeers() {
        return db.getAllbeers();
    }

    public void addBeer(String name, String type, double alc) {
        db.addBeer(name, type, alc);
    }

    public void saveBeers() throws FileNotFoundException{
            db.saveToFile();
    }
}
