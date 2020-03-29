/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class SepetController implements Initializable {
 @FXML TextArea textArea;
 @FXML Button btnTThesapla;
 @FXML Button btnSatisOnay;
 @FXML TextField txtToplamTutar;
 
static int spnadt;
static int spnadt2;
static int spnadt3;
 static String xzz;
 static String xyy;
 static String xyz;
static double x;
static double y;
static double z;
 public double aaa;
static String bb;
 

 public double ıntSet(double hesaplanan){
    this.x=hesaplanan;
    return x;
    
}public double ıntSett(double hesaplanan2){
    this.y=hesaplanan2;
    return y;
    
}public double ıntSettt(double hesaplanan3){
   this.z=hesaplanan3;
    return z;
    
}public String ToplamTutar(double x,double y,double z){
    aaa=(x+y+z);
    String b = String.valueOf(aaa);
    bb=b;
    return bb;
            
}
 public int SpnadtSet(int adet){
     spnadt=adet;
     return spnadt;
 }
  public int SpnadtSet2(int adet2){
     spnadt2=adet2;
     return spnadt2;
 }
   public int SpnadtSet3(int adet3){
     spnadt3=adet3;
     return spnadt3;
 }
public String Set(String hesaplanan){
    xzz=hesaplanan;
    return xzz;
    
}public String Sett(String hesaplanan2){
    xyy=hesaplanan2;
    return xyy;
    
}public String Settt(String hesaplanan3){
    xyz=hesaplanan3;
    return xyz;
    
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
textArea.setText("Barkod : XX44T  "+"Ürün Adı :Rotring Uçlu Kalem 0.7 mm  "+"Adet : "+spnadt
                +"  Fiyat : 20 TL  "+"Tutar :  "+xzz.toString()+" TL\n"+"Barkod : Z7YTX  "+"Ürün Adı :Faber Castell 0.7 mm Versatil Kalem  "+"Adet : "+spnadt2
                +"  Fiyat : 7 TL  "+"Tutar :  "+xyy.toString()+" TL\n"+"Barkod : 11IIU  "+"Ürün Adı :Faber Castell  Versatil Uçlu Kalem 0.5mm   "+"Adet : "+spnadt3
                +"  Fiyat : 8.35 TL  "+"Tutar :  "+xyz.toString()+" TL\n"
             );
 txtToplamTutar.setText(bb+" TL");

    }    
    
}
