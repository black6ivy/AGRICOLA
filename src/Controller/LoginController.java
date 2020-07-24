
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController implements Initializable {
/**
 *
 * @author Raja Rivaldi Ardiansyah || 19523209
 */
   @FXML
    private TextField Username;
/*
    @FXML
    private TextField Password;
    */
    @FXML
    private PasswordField Password;

    @FXML
    private Label lblStatus;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
     if (Username.getText().equals("admin") && Password.getText().equals("pass")) {
        lblStatus.setText("LOGIN SUCCESS");
       Parent scene2 = FXMLLoader.load(getClass().getResource("/View/Beranda.fxml"));
        Scene scene = new Scene(scene2);
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("AGRICOLA");
        stage.show();
    }else {
        lblStatus.setText("LOGIN FAILED"); 
     }
    
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
