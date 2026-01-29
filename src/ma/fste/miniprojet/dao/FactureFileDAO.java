package ma.fste.miniprojet.dao;

import java.io.*;
import java.util.*;

/**
 * Implémentation du DAO pour la persistance des factures
 * en utilisant un fichier binaire (sérialisation Java).
 */
public class FactureFileDAO implements FactureDAO {

    // Nom du fichier où les factures seront sauvegardées
    private final String FILE = "factures.dat";

    /**
     * Sauvegarde la liste des factures dans un fichier
     * en utilisant la sérialisation d'objets.
     *
     * @param data Liste d'objets (factures) à sauvegarder
     */
    @Override
    public void save(List<?> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(FILE))) {

            // Écriture de la liste complète dans le fichier
            oos.writeObject(data);

        } catch (Exception e) {
            // Affichage de l'erreur en cas d'échec de sauvegarde
            System.err.println("Erreur lors de la sauvegarde des factures : " + e.getMessage());
        }
    }

    /**
     * Charge la liste des factures depuis le fichier.
     * Si le fichier n'existe pas ou est vide,
     * retourne une liste vide.
     *
     * @return Liste d'objets chargés (factures)
     */
    @Override
    public List<?> load() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(FILE))) {

            // Lecture et conversion en liste
            return (List<?>) ois.readObject();

        } catch (Exception e) {
            // Si aucune donnée n'est trouvée, retourner une liste vide
            return new ArrayList<>();
        }
    }
}

