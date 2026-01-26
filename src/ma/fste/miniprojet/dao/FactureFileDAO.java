package ma.fste.miniprojet.dao;

import java.io.*;
import java.util.*;

public class FactureFileDAO implements FactureDAO {

    private final String FILE = "factures.dat";

    public void save(List<?> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<?> load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            return (List<?>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}

