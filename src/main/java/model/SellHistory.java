package model;

public class SellHistory {
    private final int date;
    private final Device device;
    private final Client client;

    public SellHistory(int date, Device device, Client client) {
        this.date = date;
        this.device = device;
        this.client = client;
    }

    public int getDate() {
        return date;
    }

    public Device getDevice() {
        return device;
    }

    public Client getClient() {
        return client;
    }


}
