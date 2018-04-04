package model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Client> clients;
    private List<Device> devices;
    private List<SellHistory> history;

    public Data() {
        List<Client> clients = new ArrayList<>();
        List<Device> devices = new ArrayList<>();
        List<SellHistory> history = new ArrayList<>();
    }


    public List<Client> getClients() {
        return clients;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public List<SellHistory> getHistory() {
        return history;
    }
}
