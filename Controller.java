package test;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField userName;

    @FXML
    private Button send;



    public void transferName(MouseEvent event) throws Exception
    {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("second.fxml"));
        Parent root = (Parent) loader.load();

        //pass the parameter to the controller of the next scene controller class
        Second controller = loader.<Second>getController();
        controller.setName(userName.getText());
        
        Scene scene = new Scene(root);
        
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        //stage.show();
                

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
