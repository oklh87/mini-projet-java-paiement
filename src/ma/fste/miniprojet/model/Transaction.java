package ma.fste.miniprojet.model;

import java.io.Serializable;

/**
 * Classe de base représentant une Transaction financière.
 * Implémente Serializable pour permettre la sauvegarde
 * des objets dans un fichier (persistance).
 */
public class Transaction implements Serializable {

    // Identifiant unique de la transaction
    protected int id;

    // Montant associé à la transaction
    protected double montant;

    /**
     * Constructeur de la classe Transaction.
     *
     * @param id Identifiant unique de la transaction
     * @param montant Montant de la transaction
     */
    public Transaction(int id, double montant) {
        this.id = id;
        this.montant = montant;
    }

    /**
     * Retourne l'identifiant de la transaction.
     *
     * @return ID de la transaction
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne le montant de la transaction.
     *
     * @return Montant de la transaction
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Retourne une représentation textuelle
     * de la transaction (ID + montant).
     *
     * @return Description de la transaction
     */
    @Override
    public String toString() {
        return "ID: " + id + " | Montant: " + montant;
    }
}

