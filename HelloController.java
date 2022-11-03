package com.example.demo2;
import javafx.application.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public TextField apple;
    public TextField chicken;
    public TextField pizza;
    public TextField burger;
    public TextField banana;
    public TextField milk;
    public TextField rice;
    public TextField noodles;
    public Button savebtn;
    public TextField totalcal;

    public void calculatecal(ActionEvent actionEvent) {

        float a1 =0;
        float a2 = 0;
        float a3 = 0;
        float a4 = 0;
        float a5 = 0;
        float a6 = 0;
        float a7 = 0;
        float  a8= 0;

        a1 = Float.parseFloat(apple.getText());
        a2 = Float.parseFloat(pizza.getText());
        a3 = Float.parseFloat(rice.getText());
        a4 = Float.parseFloat(milk.getText());
        a5 = Float.parseFloat(noodles.getText());
        a6 = Float.parseFloat(banana.getText());
        a7 = Float.parseFloat(burger.getText());
        a8 = Float.parseFloat(chicken.getText());

       double total;
       total =  87.9*a1+167.0*a4+120.4*a3+138.2*a2+143.4 * a5 +117.0*a6+384.2*a7+2.8 *a8 ;

       totalcal.setText(String.valueOf(total));

    }
}