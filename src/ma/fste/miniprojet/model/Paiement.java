package ma.fste.miniprojet.model;

public class Paiement extends Transaction {
    private String methode;

    public Paiement(int id, double montant, String methode) {
        super(id, montant);
        this.methode = methode;
    }

    @Override
    public String toString() {
        return super.toString() + " | Méthode: " + methode;
    }
}
