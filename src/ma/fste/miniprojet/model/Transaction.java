package ma.fste.miniprojet.model;

import java.io.Serializable;

public class Transaction implements Serializable {
    protected int id;
    protected double montant;

    public Transaction(int id, double montant) {
        this.id = id;
        this.montant = montant;
    }

    public int getId() { return id; }
    public double getMontant() { return montant; }

    @Override
    public String toString() {
        return "ID: " + id + " | Montant: " + montant;
    }
}
