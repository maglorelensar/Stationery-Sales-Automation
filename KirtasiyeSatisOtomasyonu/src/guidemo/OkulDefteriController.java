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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class OkulDefteriController implements Initializable {
   @FXML private Spinner spnDkizli;
    @FXML private Spinner spnDmavi;
    @FXML private Spinner spnDsari;
    
        @FXML
    private void btnPushSepetTTAction(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("Sepet.fxml"));
        Stage stage=new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("SEPETİM");
        stage.show();
    }
    
    public void ÜRÜNLERPushed(ActionEvent event) throws IOException{
    
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("Ürünler.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("ÜRÜNLER");
    window.show();
} 
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
             
    SpinnerValueFactory<Integer>snpAdetsvaluFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
    this.spnDkizli.setValueFactory(snpAdetsvaluFactory);
        SpinnerValueFactory<Integer>snpAdetssvaluFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
    this.spnDmavi.setValueFactory(snpAdetssvaluFactory);
        SpinnerValueFactory<Integer>snpAdetsssvaluFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
    this.spnDsari.setValueFactory(snpAdetsssvaluFactory);
    }    
    
}
