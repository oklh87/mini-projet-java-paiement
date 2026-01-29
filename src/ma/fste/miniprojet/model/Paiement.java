package ma.fste.miniprojet.model;

/**
 * Classe représentant un Paiement.
 * Hérite de la classe Transaction et ajoute
 * l'information sur la méthode de paiement utilisée.
 */
public class Paiement extends Transaction {

    // Méthode de paiement (ex: Carte, Cash, Virement...)
    private String methode;

    /**
     * Constructeur de la classe Paiement.
     *
     * @param id Identifiant unique du paiement
     * @param montant Montant du paiement
     * @param methode Méthode de paiement utilisée
     */
    public Paiement(int id, double montant, String methode) {
        super(id, montant); // Initialisation des champs hérités
        this.methode = methode;
    }

    /**
     * Retourne une représentation textuelle du paiement,
     * incluant les informations de base et la méthode utilisée.
     *
     * @return Description du paiement
     */
    @Override
    public String toString() {
        return super.toString() + " | Méthode: " + methode;
    }
}

