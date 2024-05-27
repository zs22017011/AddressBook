package address;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    int choice;

    public void displayMenu(){

        while(true){
            System.out.println("""
                
                MENU\

                1) Load\

                2) Add\

                3) Remove\

                4) Find\

                5) Show\
                
                6) Exit\

                --->:""");

            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= 6) {
                    break;
                }

                else {
                    System.out.println("Please enter a valid option!");
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid option!");
            }

        }
        switch (choice) {
            case 1:
                System.out.println("Loading...");
                // lógica para cargar
                break;
            case 2:
                System.out.println("Adding...");
                // lógica para agregar
                break;
            case 3:
                System.out.println("Removing...");
                // lógica para eliminar
                break;
            case 4:
                System.out.println("Finding...");
                // lógica para buscar
                break;
            case 5:
                System.out.println("Showing...");
                // lógica para mostrar
                break;
            case 6:
                System.out.println("Bye!");
                break;
        }
    }
}