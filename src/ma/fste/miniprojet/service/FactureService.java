package ma.fste.miniprojet.service;

import ma.fste.miniprojet.dao.*;
import ma.fste.miniprojet.exception.*;
import ma.fste.miniprojet.model.*;

import java.util.*;

public class FactureService {

    private List<Facture> factures = new ArrayList<>();
    private FactureFileDAO dao = new FactureFileDAO();

    public FactureService() {
        factures = (List<Facture>) dao.load();
    }

    public void ajouter(Facture f) {
        factures.add(f);
        dao.save(factures);
    }

    public Facture rechercher(int id) throws FactureNonTrouveeException {
        return factures.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElseThrow(() -> new FactureNonTrouveeException("Facture introuvable"));
    }

    public void supprimer(int id) throws FactureNonTrouveeException {
        Facture f = rechercher(id);
        factures.remove(f);
        dao.save(factures);
    }

    public void payer(int id) throws FactureNonTrouveeException {
        Facture f = rechercher(id);
        f.payer();
        dao.save(factures);
    }

    public List<Facture> afficher() {
        return factures;
    }
}

