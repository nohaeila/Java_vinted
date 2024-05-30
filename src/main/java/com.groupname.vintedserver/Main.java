package com.groupname.vintedserver;

import com.groupname.vintedserver.controllers.UserController;
import com.groupname.vintedserver.controllers.ProductController;
import com.groupname.vintedserver.models.User;
import com.groupname.vintedserver.models.Product;
import java.util.Scanner;


/**
 * Main class to demonstrate the functionality of the Vinted application.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        ProductController productController = new ProductController();

        System.out.println(("Welcome to Vinted!"));

        while (true) {
            afficherMenu();

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    seConnecter(scanner, userController);
                    break;
                case 2:
                    rechercherProduit(productController);
                    break;
                case 3:
                    vendreProduit(scanner, productController, userController);
                    break;
                case 4:
                    System.out.println("Merci d'avoir utilisé l'application. Au revoir !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez sélectionner une option valide.");
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("\nVeuillez choisir une option :");
        System.out.println("1. Se connecter");
        System.out.println("2. Rechercher un produit");
        System.out.println("3. Vendre un produit");
        System.out.println("4. Quitter");
    }

    private static void seConnecter(Scanner scanner, UserController userController) {
        System.out.println("Username : ");
        System.out.println("Password : ");
    }

    private static void rechercherProduit(ProductController productController) {

    }

    private static void vendreProduit(Scanner scanner, ProductController productController, UserController userController) {
    }
}
