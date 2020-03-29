/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klasik;

import login.Markalar;
import İnterfaces.Dayanıklılık;

/**
 *
 * @author LENOVO
 */
public class Kagit extends Markalar implements Dayanıklılık,İnterfaces.CokluRenk{

    public Kagit(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void YazCiz(){
    }public String Katlan(){
        return "";
    }public void Aktar(){ 
    }
    
    @Override
    public int DayanmaSüresiYıl() {
        return 10;
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
    class Asetat extends Kagit{
        
        public Asetat(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class Eva extends Kagit{
        
        public Eva(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class Sticker extends Kagit{
        
        public Sticker(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class Mukavva extends Kagit{
        
        public Mukavva(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class MaketKartonu extends Kagit{
        
        public MaketKartonu(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class A4 extends Kagit {
        
        public A4(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }class Zarf extends Kagit{
        
        public Zarf(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        
    }
            
}
