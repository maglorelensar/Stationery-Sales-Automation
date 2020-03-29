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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class ÜrünlerController implements Initializable {
    
    public void ButtonPushed(ActionEvent event) throws IOException{
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("UcluK.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("UÇLU KALEMLER");
    window.show();
}   
    public void DefterlerButtonPushed(ActionEvent event) throws IOException{
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("OkulDefteri.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("OKUL DEFTERLERİ");
    window.show();
}
     public void CantalarButtonPushed(ActionEvent event) throws IOException{
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("Cantalar.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("ÇANTALAR");
    window.show();
}
    public void changeAnaSayfaPushed(ActionEvent event) throws IOException{
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("FXMLtablewiew.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("ANASAYFA");
    window.show();
}
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
        
  
    
}
