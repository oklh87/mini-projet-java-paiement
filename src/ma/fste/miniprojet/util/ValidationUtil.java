package ma.fste.miniprojet.util;

/**
 * Classe utilitaire pour valider certaines données
 * du projet, comme les montants des factures ou paiements.
 * 
 * Les méthodes sont statiques pour pouvoir être appelées
 * directement sans créer d'objet.
 */
public class ValidationUtil {

    /**
     * Vérifie si un montant est valide.
     * Un montant est considéré valide s'il est strictement positif.
     *
     * @param montant Montant à vérifier
     * @return true si le montant > 0, false sinon
     */
    public static boolean montantValide(double montant) {
        return montant > 0;
    }
}


