package ma.fste.miniprojet.service;

import ma.fste.miniprojet.dao.*;
import ma.fste.miniprojet.exception.*;
import ma.fste.miniprojet.model.*;

import java.util.*;

/**
 * Service pour la gestion des factures.
 * 
 * Cette classe contient la logique métier pour :
 * - Ajouter, rechercher, supprimer et payer une facture
 * - Afficher toutes les factures
 * 
 * Elle utilise le DAO (FactureFileDAO) pour la persistance
 * des données dans un fichier.
 */
public class FactureService {

    // Liste en mémoire contenant toutes les factures
    private List<Facture> factures = new ArrayList<>();

    // DAO pour sauvegarder / charger les factures depuis un fichier
    private FactureFileDAO dao = new FactureFileDAO();

    /**
     * Constructeur de FactureService.
     * Charge toutes les factures existantes depuis le fichier.
     */
    public FactureService() {
        // Récupère les factures depuis le fichier (persistance)
        factures = (List<Facture>) dao.load();
    }

    /**
     * Ajoute une nouvelle facture.
     * La facture est ajoutée à la liste et sauvegardée dans le fichier.
     *
     * @param f Facture à ajouter
     */
    public void ajouter(Facture f) {
        factures.add(f);
        dao.save(factures); // Persistance
    }

    /**
     * Recherche une facture par son ID.
     *
     * @param id ID de la facture à rechercher
     * @return Facture correspondante
     * @throws FactureNonTrouveeException si la facture n'existe pas
     */
    public Facture rechercher(int id) throws FactureNonTrouveeException {
        return factures.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElseThrow(() -> new FactureNonTrouveeException("Facture introuvable"));
    }

    /**
     * Supprime une facture par son ID.
     * La liste est mise à jour et sauvegardée.
     *
     * @param id ID de la facture à supprimer
     * @throws FactureNonTrouveeException si la facture n'existe pas
     */
    public void supprimer(int id) throws FactureNonTrouveeException {
        Facture f = rechercher(id); // Vérifie si la facture existe
        factures.remove(f);
        dao.save(factures); // Persistance
    }

    /**
     * Marque une facture comme payée par son ID.
     * La liste est mise à jour et sauvegardée.
     *
     * @param id ID de la facture à payer
     * @throws FactureNonTrouveeException si la facture n'existe pas
     */
    public void payer(int id) throws FactureNonTrouveeException {
        Facture f = rechercher(id); // Vérifie si la facture existe
        f.payer();                  // Marque comme payée
        dao.save(factures);         // Persistance
    }

    /**
     * Retourne la liste de toutes les factures.
     *
     * @return Liste des factures
     */
    public List<Facture> afficher() {
        return factures;
    }
}


