import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private final BeerBase application;
    private final Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);

    public UserInterface(BeerBase beerBase) {
        this.application = beerBase;
    }

    public void run(){
        boolean stop = false;
        while(!stop){
            printMenu();
            int choice = getIntFromUser();
            switch (choice){
                case 0 ->  stop = true; // stop the program
                case 1 -> listAllBeers();
                case 2 -> listFilteredBeers();
                case 3 -> getSpecificBeer();
                case 4 -> editBeer();
                case 5 -> addBeer();
                case 6 -> removeBeer();
                case 7 -> saveBeers();
                default -> print("Invalid input");
            }
        }
    }

    private boolean saveBeers() {
        try{
            application.saveBeers();
            return true;
        }catch (FileNotFoundException e){
            System.out.println();
            return false;
        }
    }

    private void removeBeer() {
    }

    private void addBeer() {
        System.out.println("Add new beer: ");
        System.out.print("Name: ");
        String name = input.nextLine().trim();

        System.out.print("Type: ");
        String type = input.nextLine().trim();

        System.out.print("Alc%: ");
        double alc = Double.parseDouble(input.nextLine().trim());

        application.addBeer(name, type, alc);
    }

    private void editBeer() {
    }

    private void getSpecificBeer() {
    }

    private void listFilteredBeers() {
    }

    private void listAllBeers() {
        List<Beer> beers = application.getAllBeers();
        for (Beer beer : beers) {
            printBeer(beer);
        }
    }

    public int getIntFromUser() {
        System.out.print(":");
        String inputString = input.nextLine().trim();
        try {
            return Integer.parseInt(inputString);
        }catch (NumberFormatException e){
            return -1;
        }
    }

    public void printBeer(Beer beer){
        System.out.println(beer);
    }

    public void printMenu() {
        System.out.println("""
                1. List all beers in database
                2. List filtered beers
                3. Find beer
                4. Edit beer
                5. Add beer
                6. Remove beer
                7. Save beers""");
    }

    public void print(String string) {
        System.out.println(string);
    }
}
