package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Commit implements Request {
    @Override
    public String execute() {
        Database database = new Database();
        database.commit();
        return null;
    }
}
