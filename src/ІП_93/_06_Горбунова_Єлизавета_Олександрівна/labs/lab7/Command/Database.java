package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<String> database = new ArrayList<>();
    private static List<String> backup = new ArrayList<>();
    public String select(String query) {
        if(isNumeric(query) && Integer.parseInt(query) < database.size()) {
            return database.get(Integer.parseInt(query));
        }
        if (database.contains(query)) return String.valueOf(database.indexOf(query));
        else {
            rollback();
            return null;
        }
    }

    public void insert(String query) {
        database.add(query);
    }

    public void commit() {
        backup = List.copyOf(database);
    }

    public void rollback() {
        database = List.copyOf(backup);
    }

    public void delete(String query) {
        if(isNumeric(query) && Integer.parseInt(query) < database.size()) {
            database.remove(Integer.parseInt(query));
            return;
        }
        if (database.contains(query)) database.remove(query);
        else rollback();
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
