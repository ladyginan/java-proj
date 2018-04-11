package Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class MainMenu extends AbstractMenu{

    public MainMenu(){
        initMenuItems();
    }

    private void initMenuItems(){
        this.items.add("Create");
        this.items.add("Sort");
        this.items.add("Search");
    }

    @Override
    public void interactWithMenu() {
        String s = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (s){
            case("1"):
                break;
            case("2"):
                break;
            case("3"):
                break;
        }
    }
}
