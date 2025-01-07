/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package track_fitness;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private BorderPane bp;
    @FXML
    private VBox main;
    @FXML
    private VBox m;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            Parent root = FXMLLoader.load(getClass().getResource("Add_InfoFXML.fxml"));
            
            main.getChildren().setAll(root);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void addInfo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Add_InfoFXML.fxml"));
          
            main.getChildren().setAll(root);
    }

    @FXML
    private void showInfo(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Show_InformationFXML.fxml"));
          
            main.getChildren().setAll(root);
        
    }

    @FXML
    private void About(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
          
            main.getChildren().setAll(root);
    }
    
}
