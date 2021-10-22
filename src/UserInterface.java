import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final BeerBase application;
    private final Scanner input = new Scanner(System.in);

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
                default -> print("Invalid input");
            }
        }
    }

    private void removeBeer() {
    }

    private void addBeer() {
    }

    private void editBeer() {
    }

    private void getSpecificBeer() {
    }

    private void listFilteredBeers() {
    }

    private void listAllBeers() {
        ArrayList<Beer> beers = application.getAllBeers();
        for (Beer beer : beers) {
            System.out.println(beer);
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
