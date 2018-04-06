package model;

import java.util.Comparator;
import java.util.UUID;

class ClientIdComparator implements Comparator<Client>{
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
