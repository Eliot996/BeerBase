import java.util.ArrayList;

public class BeerBase {
    private UserInterface ui = new UserInterface(this);// <- dependency injection
    private Database db = new Database();

    public void run(){
        ui.run();
    }

    public static void main(String[] args) {
        new BeerBase().run();
    }

    public ArrayList<Beer> getAllBeers() {
        return db.getAllbeers();
    }
}
