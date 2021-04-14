package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Insert implements Request {
    private String query;
    Insert(String query) {
        this.query = query;
    }
    @Override
    public String execute() {
        Database database = new Database();
        database.insert(query);
        return null;
    }
}
