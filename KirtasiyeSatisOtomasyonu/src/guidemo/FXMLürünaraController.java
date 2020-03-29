/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import Classes.UcluK;
import dom.ReadXML;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class FXMLürünaraController implements Initializable {

 @FXML TextField txtÜrünBarkod;
 @FXML TextArea TextAreaa;
  @FXML private Spinner spnD1;
  @FXML private Spinner spnD2;
  @FXML private Spinner spnD3;
 
 public void GörüntüleXML(ActionEvent event) throws Exception{
     ReadXML r=new ReadXML();
     
     TextAreaa.setText(r.okuXML().toString());
 }
 public void UrunSorgula(ActionEvent event){
     
 }
   public void btnSepeteEkle1(ActionEvent event){
         int x=(int) spnD1.getValue();
         UcluK uck =new UcluK();
         uck.Hesapla(x);
         SepetController spt=new SepetController();
        // String abc=Double.toString(uck.hesaplananfiyat);
        String abc = String.valueOf(uck.hesaplananfiyat);
        spt.SpnadtSet(x);
        spt.Set(abc);
        System.out.println(abc);
    }
       public void btnSepeteEkle2(ActionEvent event){
         int y=(int) spnD2.getValue();
         UcluK uck =new UcluK();
         uck.Hesaplaa(y);
         SepetController spt=new SepetController();
        // String abc=Double.toString(uck.hesaplananfiyat);
        String abcd = String.valueOf(uck.hesaplananfiyat2);
        spt.SpnadtSet2(y);
        spt.Sett(abcd);
        System.out.println(abcd);
    }
        public void btnSepeteEkle3(ActionEvent event){
         int z=(int) spnD3.getValue();
         UcluK uck =new UcluK();
         uck.Hesaplaaa(z);
         SepetController spt=new SepetController();
        // String abc=Double.toString(uck.hesaplananfiyat);
        String aa = String.valueOf(uck.hesaplananfiyat3);
        spt.SpnadtSet3(z);
        spt.Settt(aa);
        System.out.println(aa);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
