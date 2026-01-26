package ma.fste.miniprojet.model;

public class Facture extends Transaction {
    private String client;
    private boolean payee;

    public Facture(int id, double montant, String client) {
        super(id, montant);
        this.client = client;
        this.payee = false;
    }

    public void payer() {
        this.payee = true;
    }

    public boolean isPayee() {
        return payee;
    }

    @Override
    public String toString() {
        return super.toString() + " | Client: " + client + " | Payée: " + payee;
    }
}
