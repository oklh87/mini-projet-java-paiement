package ma.fste.miniprojet.exception;

/**
 * Exception personnalisée levée lorsqu'une facture
 * recherchée n'est pas trouvée dans le système.
 *
 * Elle permet de gérer proprement les erreurs métier
 * au lieu d'utiliser des exceptions génériques.
 */
public class FactureNonTrouveeException extends Exception {

    /**
     * Constructeur de l'exception avec un message explicatif.
     *
     * @param message Message décrivant la cause de l'erreur
     */
    public FactureNonTrouveeException(String message) {
        super(message);
    }
}


