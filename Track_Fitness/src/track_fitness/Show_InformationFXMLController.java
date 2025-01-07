/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package track_fitness;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Show_InformationFXMLController implements Initializable {

    @FXML
    private TableView<data> DTable;
    @FXML
    private TableColumn<data, String> Time;
    @FXML
    private TableColumn<data, String> Date;
    @FXML
    private TableColumn<data, String> Weight;
    @FXML
    private TableColumn<data, String> bp;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            Databasecon db = new Databasecon();
            Add_InfoFXMLController.list =  db.getData();
            DTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            // AddstudentController.list.clear();
            Time.setCellValueFactory(new PropertyValueFactory<data, String>("Time"));
            Date.setCellValueFactory(new PropertyValueFactory<data, String>("Date"));
            Weight.setCellValueFactory(new PropertyValueFactory<data, String>("Weight"));
            bp.setCellValueFactory(new PropertyValueFactory<data, String>("bp"));
            DTable.setItems(Add_InfoFXMLController.list);
        } catch (SQLException ex) {
            Logger.getLogger(Show_InformationFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
