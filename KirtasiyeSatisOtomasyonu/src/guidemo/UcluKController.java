    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import Classes.UcluK;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class UcluKController implements Initializable {
    @FXML private ImageView rotringsiyah;
    @FXML private ImageView faberyesil;
    @FXML private ImageView fabermor;
    @FXML private Spinner spnRsiyah;
    @FXML private Spinner spnFyesil;
    @FXML private Spinner spnFmor;
    
    @FXML
    private void btnPushSepetAction(ActionEvent event) throws IOException{
         Parent root = FXMLLoader.load(getClass().getResource("Sepet.fxml"));
        Stage stage=new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("SEPETİM");
        stage.show();
    }
    
    public void ButtonBackPushed(ActionEvent event) throws IOException{
    
    Parent tableWiewParent=FXMLLoader.load(getClass().getResource("Ürünler.fxml"));
    Scene tableWiewScene=new Scene(tableWiewParent);
    
    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tableWiewScene);
    window.setTitle("ÜRÜNLER");
    window.show();
} 
        public void btnSepeteEkle1(ActionEvent event){
         int x=(int) spnRsiyah.getValue();
         UcluK uck =new UcluK();
         uck.Hesapla(x);
         SepetController spt=new SepetController();
        // String abc=Double.toString(uck.hesaplananfiyat);
        String abc = String.valueOf(uck.hesaplananfiyat);
        spt.ıntSet(uck.hesaplananfiyat);
        spt.ToplamTutar(uck.hesaplananfiyat, uck.hesaplananfiyat, uck.hesaplananfiyat);
        spt.SpnadtSet(x);
        spt.Set(abc);
        System.out.println(abc);
    }
       public void btnSepeteEkle2(ActionEvent event){
         int y=(int) spnFyesil.getValue();
         UcluK uck =new UcluK();
         uck.Hesaplaa(y);
         SepetController spt=new SepetController();
        // String abc=Double.toString(uck.hesaplananfiyat);
        String abcd = String.valueOf(uck.hesaplananfiyat2);
        spt.ıntSett(uck.hesaplananfiyat2);
        spt.SpnadtSet2(y);
        spt.Sett(abcd);
        System.out.println(abcd);
    }
        public void btnSepeteEkle3(ActionEvent event){
         int z=(int) spnFmor.getValue();
         UcluK uck =new UcluK();
         uck.Hesaplaaa(z);
         SepetController spt=new SepetController();
        // String abc=Double.toString(uck.hesaplananfiyat);
        String aa = String.valueOf(uck.hesaplananfiyat3);
        spt.ıntSettt(uck.hesaplananfiyat3);
        spt.SpnadtSet3(z);
        spt.Settt(aa);
        System.out.println(aa);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     Image image = new Image("/icons/RotringSiyah.jpg"); 
     rotringsiyah.setImage(image);
     Image imagee = new Image("/icons/FaberMor.jpg"); 
     fabermor.setImage(imagee);
     Image ima = new Image("/icons/FaberYeşil.jpg"); 
     faberyesil.setImage(ima);
     
    SpinnerValueFactory<Integer>snpAdetsvaluFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
    this.spnRsiyah.setValueFactory(snpAdetsvaluFactory);
        SpinnerValueFactory<Integer>snpAdetssvaluFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
    this.spnFyesil.setValueFactory(snpAdetssvaluFactory);
        SpinnerValueFactory<Integer>snpAdetsssvaluFactory=new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,1);
    this.spnFmor.setValueFactory(snpAdetsssvaluFactory);
  
    }    

 
    
}
