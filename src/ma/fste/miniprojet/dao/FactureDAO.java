package ma.fste.miniprojet.dao;
import java.util.List;

    public interface FactureDAO {
           void save(List<?> data);
           List<?> load();
    }

