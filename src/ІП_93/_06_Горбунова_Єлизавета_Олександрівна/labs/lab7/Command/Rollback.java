package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Rollback implements Request{
    @Override
    public String execute() {
        Database database = new Database();
        database.rollback();
        return null;
    }
}
