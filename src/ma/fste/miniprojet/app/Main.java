package ma.fste.miniprojet.app;

import ma.fste.miniprojet.model.*;
import ma.fste.miniprojet.service.*;
import ma.fste.miniprojet.exception.*;

import java.util.Scanner;

/**
 * Classe principale qui lance l'application
 * Gère le menu console pour la gestion des factures
 */
public class Main {

    public static void main(String[] args) {

        // Scanner pour lire les entrées utilisateur
        Scanner sc = new Scanner(System.in);

        // Service contenant la logique métier des factures
        FactureService service = new FactureService();

        // Boucle infinie pour afficher le menu jusqu'à quitter
        while (true) {
            System.out.println("\n--- MENU PAIEMENT & FACTURATION ---");
            System.out.println("1. Ajouter facture");
            System.out.println("2. Payer facture");
            System.out.println("3. Supprimer facture");
            System.out.println("4. Rechercher facture");
            System.out.println("5. Afficher factures");
            System.out.println("0. Quitter");

            // Lire le choix de l'utilisateur
            int choix = sc.nextInt();

            try {

                // OPTION 1 : Ajouter une facture
                if (choix == 1) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // vider le buffer

                    System.out.print("Client: ");
                    String client = sc.nextLine();

                    System.out.print("Montant: ");
                    double montant = sc.nextDouble();

                    // Création et ajout de la facture
                    service.ajouter(new Facture(id, montant, client));
                }

                // OPTION 2 : Payer une facture
                else if (choix == 2) {
                    System.out.print("ID facture: ");
                    service.payer(sc.nextInt());
                }

                // OPTION 3 : Supprimer une facture
                else if (choix == 3) {
                    System.out.print("ID facture: ");
                    service.supprimer(sc.nextInt());
                }

                // OPTION 4 : Rechercher une facture par ID
                else if (choix == 4) {
                    System.out.print("ID facture: ");
                    System.out.println(service.rechercher(sc.nextInt()));
                }

                // OPTION 5 : Afficher toutes les factures
                else if (choix == 5) {
                    service.afficher().forEach(System.out::println);
                }

                // OPTION 0 : Quitter l'application
                else if (choix == 0) {
                    System.out.println("Fermeture du programme...");
                    break;
                }

            } catch (Exception e) {
                // Gestion des erreurs
                System.out.println("Erreur : " + e.getMessage());
            }
        }

        // Fermeture du scanner
        sc.close();
    }
}

