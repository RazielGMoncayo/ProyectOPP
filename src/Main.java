import com.proyect.opp.information.Owner;
import com.proyect.opp.menu.OwnerMenu;
import com.proyect.opp.menu.PetMenu;
import jdk.jshell.Snippet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        OwnerMenu ownerMenu = new OwnerMenu(sc);
        PetMenu petMenu = new PetMenu(sc);

        System.out.println("--------------------------------------");
        System.out.println("- Welcome to the veterinary hospital -");
        System.out.println("--------------------------------------");


        int menu;
        boolean program = true;

        while (program){
            try {
                do {
                    System.out.println("\n---------------Main menu--------------");
                    System.out.println("-----------Select an option-----------");
                    System.out.println("1. List all the owners");
                    System.out.println("2. Add a new owner");
                    System.out.println("3. Look for a owner");
                    System.out.println("4. Delete a owner");
                    System.out.println("5. Finish");

                    menu = sc.nextInt();
                    sc.nextLine();

                    switch (menu) {
                        case 1:
                            ownerMenu.listOwner();
                            break;
                        case 2:
                            Owner newOwner = ownerMenu.addNewOwner();
                            System.out.println("Now adding a pet to " + newOwner.getName());
                            petMenu.addPet(newOwner);
                            break;
                        case 3:
                            Owner foundOwner = ownerMenu.lookforOwner();
                            if (foundOwner != null){
                                System.out.println("Owner found: ");
                                System.out.println(foundOwner.getName() + " " + foundOwner.getEmail() + " " + foundOwner.getPhoneNumber());
                            } else {
                                System.out.println("Owner not found");
                            }
                            break;
                        case 4:
                            ownerMenu.deleteOwnerByEmail();
                            break;
                        case 5:
                            System.out.println("Exiting....");
                            program = false;
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                } while (menu != 5);
            } catch (InputMismatchException e){
                System.out.println("Error: You must enter a number");
                sc.next();
            }
        }
        sc.close();

    }
}