package controler;

import model.Client;

import java.util.ArrayList;

public class Search {

    public Client searchByName(ArrayList<Client> list, String name) {
        int i = 0;
        Client result;
        for (Client client : list) {
            list.get(i);
            i++;
            if (client.getName().equals(name)) {
                result = list.get(i);
                return result;
            } else {
                searchByName(list, name);
            }
        }
        return null;
    }

    public Client searchById(ArrayList<Client> list, int id) {
        int i = 0;
        Client result;
        for (Client client : list) {
            list.get(i);
            i++;
            if (client.getClientId() == id) {
                result = list.get(i);
                return result;
            } else {
                searchById(list, id);
            }
        }
        return null;
    }

}
