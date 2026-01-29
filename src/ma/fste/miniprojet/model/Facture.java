package ma.fste.miniprojet.model;

/**
 * Classe représentant une Facture.
 * Hérite de la classe Transaction et ajoute
 * des informations spécifiques au client et au paiement.
 */
public class Facture extends Transaction {

    // Nom du client associé à la facture
    private String client;

    // Indique si la facture est payée ou non
    private boolean payee;

    /**
     * Constructeur de la classe Facture.
     *
     * @param id Identifiant unique de la facture
     * @param montant Montant de la facture
     * @param client Nom du client
     */
    public Facture(int id, double montant, String client) {
        super(id, montant); // Appel du constructeur parent (Transaction)
        this.client = client;
        this.payee = false; // Par défaut, la facture n'est pas payée
    }

    /**
     * Marque la facture comme payée.
     */
    public void payer() {
        this.payee = true;
    }

    /**
     * Vérifie si la facture est payée.
     *
     * @return true si la facture est payée, false sinon
     */
    public boolean isPayee() {
        return payee;
    }

    /**
     * Retourne une représentation textuelle de la facture
     * incluant les informations de la transaction et du client.
     *
     * @return Description complète de la facture
     */
    @Override
    public String toString() {
        return super.toString() + 
               " | Client: " + client + 
               " | Payée: " + payee;
    }
}

