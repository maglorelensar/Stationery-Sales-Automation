/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Klasik.Canta;
import Klasik.Defter;
import Klasik.Kalem;
import Klasik.Silgi;
import Klasik.Uc;
import Sanatsal.Boya;
import Sanatsal.Yapistirici;

/**
 *
 * @author LENOVO
 */
public class Markalar extends Ürünler{
    String adı;
    String barkod;
    String fiyat;
    int markaNo;
   public Markalar(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }

    public Markalar() {
        System.out.println("Markalar Constructor");
    }
    public Markalar (int markano){
        this.markaNo=markano;
    }
        
    public Markalar(String Adı){
        this.Adı=adı;
    }
    public Markalar (String barkod ,String Fiyat){
        this.barkod=barkod;
        this.fiyat=Fiyat;
    }

    Kalem Pensan;
    Kalem FaberCst;
    Kalem Rotring;
    Silgi Micro;
    Silgi FaberCstt;
    Silgi Nokı;
    Yapistirici UHU;
    Yapistirici Pritt;
    Defter Mitos;
    Defter Asist;
    Uc Magnum;
    Uc Microo;
    Canta Nike;
    Canta Adidas;
    Canta Puma;
    Boya Vincent;
    Boya FaberCstl;
    
      
 /*   Kalem Pensan;
    Kalem FaberCst;
    Kalem Rotring;
    Silgi Micro;
    Silgi FaberCstt;
    Silgi Nokı;
    Yapistirici UHU;
    Yapistirici Pritt;
    Defter Mitos;
    Defter Asist;
    Uc Magnum;
    Uc Microo;
    Çanta Nike;
    Çanta Adidas;
    Çanta Puma;
    Boya Vincent;
    Boya FaberCstl;
    
   */

    @Override
    public void UrunTani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

