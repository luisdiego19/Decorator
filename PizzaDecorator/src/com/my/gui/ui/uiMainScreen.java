package com.my.gui.ui;

import com.my.controller.Controller;
import com.my.gui.frames.MainScreen;

public class uiMainScreen {
    
    private final MainScreen mainScreen;
    private final Controller controller;

    public uiMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
        controller = new Controller();
    }
    
    public void accionBtnCrearArma()
    {
       controller.crearPizza();
       imprimirStatusArma();
    }        
    
    public void accionBtnAgregarSilenciador()
    {
        controller.agregarSalsaTomate();
        imprimirStatusArma();
    }
    
    public void accionBtnAgregarMira()
    {
        controller.agregarMozzarella();
        imprimirStatusArma();
    }
    
    private void imprimirStatusArma()
    {
        mainScreen.getTxtArStatus().setText(" ");
        if(controller.getPizza() != null)
            mainScreen.getTxtArStatus().setText(controller.getPizza().getDescription() 
            + "\n Cost: " + controller.getPizza().getCost());
    }    
}
