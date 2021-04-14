package ІП_93._06_Горбунова_Єлизавета_Олександрівна.labs.lab7.Command;

public class Main {
    public static void main(String[] args) {
        Invoker selectBtn = new Invoker();
        Invoker insertBtn = new Invoker();
        Invoker deleteBtn = new Invoker();
        Invoker commitBtn = new Invoker();
        Invoker rollbackBtn = new Invoker();

        //insert Jerry
        insertBtn.setRequest(new Insert("Jerry"));
        insertBtn.executeRequest();
        //insert Maria
        insertBtn.setRequest(new Insert("Maria"));
        insertBtn.executeRequest();
        //insert no name
        insertBtn.setRequest(new Insert("No name"));
        insertBtn.executeRequest();

        //commit
        commitBtn.setRequest(new Commit());
        commitBtn.executeRequest();

        //select id 0
        selectBtn.setRequest(new Select("0"));
        String data = selectBtn.executeRequest();
        System.out.println("On place 0 is " + data);

        //select jerry
        selectBtn.setRequest(new Select("Jerry"));
        String data2 = selectBtn.executeRequest();
        System.out.println("Jerry is on place " + data2);

        //delete Maria
        deleteBtn.setRequest(new Delete("Maria"));
        deleteBtn.executeRequest();

        //rollback
        rollbackBtn.setRequest(new Rollback());
        rollbackBtn.executeRequest();

        //select place 1
        selectBtn.setRequest(new Select("1"));
        String data3 = selectBtn.executeRequest();
        System.out.println("Now on place 1 is " + data3);

        //select Maria
        selectBtn.setRequest(new Select("Maria"));
        String data4 = selectBtn.executeRequest();
        System.out.println("Maria is on place " + data4);

    }
}
