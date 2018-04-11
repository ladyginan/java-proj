package Application.controler;

import Application.View;
import Application.model.Model;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }



}
