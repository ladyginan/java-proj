package controler;

import model.Client;
import model.Device;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Creator {
    public Client createClient() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        return new Client(name, year);
    }

    public Device createDevice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mark = reader.readLine();
        String color = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        return new Device(mark, color, year);
    }

    public void createSellHistory() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ClientId = Integer.parseInt(reader.readLine());
        int DeviceId = Integer.parseInt(reader.readLine());
        int date = Integer.parseInt(reader.readLine());

    }

}
