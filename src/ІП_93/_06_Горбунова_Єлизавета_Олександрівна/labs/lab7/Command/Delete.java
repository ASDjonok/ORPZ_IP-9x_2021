package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Delete implements Request {
    private String query;
    Delete(String query) {
        this.query = query;
    }
    @Override
    public String execute() {
        Database database = new Database();
        database.delete(query);
        return null;
    }
}
