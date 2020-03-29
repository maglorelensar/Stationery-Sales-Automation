/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klasik;

import login.Markalar;
import İnterfaces.CokluRenk;
import İnterfaces.Dayanıklılık;

/**
 *
 * @author LENOVO
 */
public class Kalem extends Markalar implements CokluRenk,Dayanıklılık,İnterfaces.CokluUcTakabilme{

    public Kalem(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void Yaz(){
        
    }

    @Override
    public int DayanmaSüresiYıl() {
        return 4;
    }
    @Override
    public void RenkBelirle() {
    }
    @Override
    public String RenkB() {
        return "";
    }
    @Override
    public String RenkTipi(String renk) {
        return "";
    }

    @Override
    public String CokluUcTak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
class UcluK extends Kalem{
        
        public UcluK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class KursunK extends Kalem{
        
        public KursunK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class TükenmezK extends Kalem{
        
        public TükenmezK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class DolmaK extends Kalem{
        
        public DolmaK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class TahtaK extends Kalem{
        
        public TahtaK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class KeçeliK extends Kalem{
        
        public KeçeliK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class FosforluK extends Kalem{
        
        public FosforluK(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
}}
