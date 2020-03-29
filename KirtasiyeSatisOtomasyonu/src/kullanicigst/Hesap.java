/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicigst;

/**
 *
 * @author LENOVO
 */
public class Hesap {
      public double sonuc;
      public String xyz;
      ÜrünBilgileri gg=new ÜrünBilgileri();
    
      public String Hesapla(){
         
         sonuc=(gg.getFiyat()*gg.getAdet());
         String x=String.valueOf(sonuc);
         xyz=x;
         return xyz;
         

     }
}
