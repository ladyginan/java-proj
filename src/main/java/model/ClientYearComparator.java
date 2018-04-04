package model;


import java.util.Comparator;

public class ClientYearComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getYear() - o2.getYear();
    }
}

