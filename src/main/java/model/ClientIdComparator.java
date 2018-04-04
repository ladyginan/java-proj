package model;

import java.util.Comparator;

public class ClientIdComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getClientId() - o2.getClientId();
    }
}
