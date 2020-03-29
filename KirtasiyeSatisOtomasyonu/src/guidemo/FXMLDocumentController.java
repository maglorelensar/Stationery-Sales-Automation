/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;




import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;




/**
 *
 * @author LENOVO
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label lblMessage;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnGiris;
 
    
    @FXML
    private void btnGirisAction(ActionEvent event) throws IOException{
        if(txtUsername.getText().equals("admin")&&txtPassword.getText().equals("admin")){
       Parent root = FXMLLoader.load(getClass().getResource("FXMLtablewiew.fxml"));
        Stage stage=new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Kullanıcı Giriş");
        stage.show();
        }else{
            lblMessage.setText("Kullanıcı veya Parola Hatalı !!");
        }
    }
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
    }    
    
}
