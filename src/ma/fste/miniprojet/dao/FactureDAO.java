package ma.fste.miniprojet.dao;

import java.util.List;

/**
 * Interface DAO (Data Access Object) pour la gestion
 * de la persistance des factures.
 *
 * Elle définit les méthodes nécessaires pour
 * sauvegarder et charger des données depuis un support
 * (fichier, base de données, mémoire, etc.).
 */
public interface FactureDAO {

    /**
     * Sauvegarde une liste de données (factures) vers un support de stockage.
     *
     * @param data Liste d'objets à sauvegarder
     */
    void save(List<?> data);

    /**
     * Charge la liste des données (factures) depuis un support de stockage.
     *
     * @return Liste d'objets chargés
     */
    List<?> load();
}

