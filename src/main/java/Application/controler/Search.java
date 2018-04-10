package Application.controler;

import Application.model.Client;

import java.util.ArrayList;
import java.util.UUID;

public class Search {
    public Client searchByName(ArrayList<Client> list, String name) {
        int i = 0;
        Client result = null;
        for (Client client : list) {
            list.get(i);
            i++;
            if (client.getName().equals(name)) {
                result = list.get(i);
            }
        }
        if(result == null){
            System.out.println("Client not found");
        }
        return result;
    }

    public Client searchById(ArrayList<Client> list, UUID id){
        int i = 0;
        Client result = null;
        for(Client client : list){
            list.get(i);
            i++;
            if(client.getId().equals(id)){
                result = list.get(i);
            }
        }
        if(result == null){
            System.out.println("Client not found");
        }
        return result;
    }

    public Client searchByYear(ArrayList<Client> list, int year){
        int i = 0;
        Client result = null;
        for(Client client : list){
            list.get(i);
            i++;
            if(client.getYear() == year){
                result = list.get(i);
            }
        }
        if(result == null){
            System.out.println("Client not found");
        }
        return result;
    }

}
