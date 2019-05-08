/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author hania
 */
public class Second implements Initializable {

    @FXML
    private Label transferedName;

    public String name;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    } 
    
    public void setName(String name){
        //System.out.println("$$$$$$" + name);
        this.name = name;
        //transferedName.setText(name);
        System.out.println(this.name);
        setUsername();
    }
    
    private void setUsername(){
        transferedName.setText(name);
    }
    
}
