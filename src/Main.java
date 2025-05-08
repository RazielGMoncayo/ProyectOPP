import com.proyect.opp.menu.OwnerMenu;
import jdk.jshell.Snippet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        OwnerMenu ownerMenu = new OwnerMenu(sc);

        System.out.println("--------------------------------------");
        System.out.println("- Welcome to the veterinary hospital -");
        System.out.println("--------------------------------------");


        int menu;
        boolean program = true;

        while (program){
            try {
                do {
                    System.out.println("---------------Main menu--------------");
                    System.out.println("-----------Select an option-----------");
                    System.out.println("1. Add a new owner");
                    System.out.println("2. Finish");

                    menu = sc.nextInt();
                    sc.nextLine();

                    switch (menu) {
                        case 1:
                            ownerMenu.addnewOwner();
                            break;
                        case 2:
                            System.out.println("Exiting....");
                            program = false;
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                } while (menu != 2);
            } catch (InputMismatchException e){
                System.out.println("Error: You must enter a number");
                sc.next();
            }
        }
        sc.close();

    }
}