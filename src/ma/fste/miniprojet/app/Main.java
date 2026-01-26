package ma.fste.miniprojet.app;

import ma.fste.miniprojet.model.*;
import ma.fste.miniprojet.service.*;
import ma.fste.miniprojet.exception.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactureService service = new FactureService();

        while (true) {
            System.out.println("\n--- MENU PAIEMENT & FACTURATION ---");
            System.out.println("1. Ajouter facture");
            System.out.println("2. Payer facture");
            System.out.println("3. Supprimer facture");
            System.out.println("4. Rechercher facture");
            System.out.println("5. Afficher factures");
            System.out.println("0. Quitter");

            int choix = sc.nextInt();

            try {
                if (choix == 1) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Client: ");
                    String client = sc.nextLine();

                    System.out.print("Montant: ");
                    double montant = sc.nextDouble();

                    service.ajouter(new Facture(id, montant, client));
                }

                else if (choix == 2) {
                    System.out.print("ID facture: ");
                    service.payer(sc.nextInt());
                }

                else if (choix == 3) {
                    System.out.print("ID facture: ");
                    service.supprimer(sc.nextInt());
                }

                else if (choix == 4) {
                    System.out.print("ID facture: ");
                    System.out.println(service.rechercher(sc.nextInt()));
                }

                else if (choix == 5) {
                    service.afficher().forEach(System.out::println);
                }

                else if (choix == 0) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }
}

