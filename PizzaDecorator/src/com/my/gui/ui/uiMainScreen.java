package com.my.gui.ui;

import com.my.controller.Controller;
import com.my.gui.frames.MainScreen;
import java.awt.Color;
import java.awt.Font;

public class uiMainScreen {
    
    private final MainScreen mainScreen;
    private final Controller controller;

    public uiMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
        controller = new Controller();
        colorFrame();        
    }
    
    private void colorFrame()
    {        
        this.mainScreen.getContentPane().setBackground(new Color(60,63,65));
        this.mainScreen.getBtnAdicionarMozzarella().setBackground(new Color(60,63,65));
        this.mainScreen.getBtnAdicionarSalsaTomate().setBackground(new Color(60,63,65));
        this.mainScreen.getBtnCrearPizza().setBackground(new Color(60,63,65));
        this.mainScreen.getTxtArStatus().setBackground(new Color(69,73,74));
        this.mainScreen.getTxtArStatus().setFont(new Font("Dialog",1,12));
        this.mainScreen.getTxtArStatus().setForeground(new Color(187,187,187));  
        this.mainScreen.getLblAgregarQueso().setForeground(new Color(187,187,187));
        this.mainScreen.getLblAgregarTomate().setForeground(new Color(187,187,187));
        this.mainScreen.getLblCrearPizza().setForeground(new Color(187,187,187));
        this.mainScreen.getLblAgregarQueso().setFont(new Font("Dialog",1,12));
        this.mainScreen.getLblAgregarTomate().setFont(new Font("Dialog",1,12));
        this.mainScreen.getLblCrearPizza().setFont(new Font("Dialog",1,12));
    }
    
    public void accionBtnCrearPizza()
    {
       controller.crearPizza();
       imprimirStatusPizza();
    }        
    
    public void accionBtnAgregarSalsaTomate()
    {
        controller.agregarSalsaTomate();
        imprimirStatusPizza();
    }
    
    public void accionBtnAgregarMozzarella()
    {
        controller.agregarMozzarella();
        imprimirStatusPizza();
    }
    
    private void imprimirStatusPizza()
    {
        mainScreen.getTxtArStatus().setText(" ");
        if(controller.getPizza() != null)
            mainScreen.getTxtArStatus().setText(controller.getPizza().getDescription() 
            + "\n Cost: " + controller.getPizza().getCost());
    }    
}
