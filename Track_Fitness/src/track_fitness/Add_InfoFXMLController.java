
package track_fitness;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Add_InfoFXMLController implements Initializable {

    @FXML
    private DatePicker invalue;
    @FXML
    private TextField inWeight;
    @FXML
    private TextField inSbp;
    @FXML
    private TextField inDbp;
    @FXML
    private TextField tF;
    @FXML
    private Text info;
    private Label info1;

   static ObservableList<data> list = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void DoSave(ActionEvent event) throws SQLException {
        if (tF.getText().equals("")) {
            return;
        }
        
        String Time = tF.getText();
        String Date = ""+invalue.getValue();
        
        String Weight = inWeight.getText();
        String bp = inSbp.getText()+"/"+inDbp.getText();

        if (Date.equals("") || Weight.equals("") || bp.equals("")) {
            return;
        }
        data d= new data(Time,Date,Weight,bp);
        Databasecon db = new Databasecon();
        String s= db.insertData(d);
        System.out.println(s);
        info.setText(s);
        info1.setText(s);
        inWeight.clear();
        inSbp.clear();
        inDbp.clear();
        tF.clear();
        
    }

    @FXML
    private void DoReset(ActionEvent event) {
        inWeight.clear();
        inSbp.clear();
        inDbp.clear();
        tF.clear();
        
    }
    
}
