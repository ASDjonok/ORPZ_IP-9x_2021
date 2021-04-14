package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Select implements Request {
    private String query;
    Select(String query) {
        this.query = query;
    }
    @Override
    public String execute() {
        Database database = new Database();
        return database.select(query);
    }
}
