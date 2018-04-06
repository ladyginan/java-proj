package model;

import java.util.UUID;

public class Client {

    final private String name;
    final private int year;
    private UUID clientId;


    public Client(String name, int year) {
        this.name = name;
        this.year = year;
        this.clientId = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public UUID getId() {
        return clientId;
    }

}

