package model;

public class Client {

    final private String name;
    final private int year;
    private int clientId;


    public Client(String name, int year) {
        this.name = name;
        this.year = year;
        this.clientId = clientId++;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getClientId() {
        return clientId;
    }

}

