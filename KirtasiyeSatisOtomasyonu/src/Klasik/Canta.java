/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klasik;

import login.Markalar;


/**
 *
 * @author LENOVO
 */
public class Canta extends Markalar implements İnterfaces.CokluRenk,İnterfaces.Dayanıklılık{

    public Canta(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void Tasi(){
        
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
        return renk;
    }

    @Override
    public int DayanmaSüresiYıl() {
        return 10;
    }

class BeslenmeC extends Canta{
        
        public BeslenmeC(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Beslenme", "123UY", "48 TL", "Nike");
        }

        @Override
        public int DayanmaSüresiYıl() {
            return 5;
        }
        @Override
        public void Tasi() {
            System.out.println("Beslenme çantası ile taşınıyor ..");
        }
        @Override
        public String RenkTipi(String renk) {
            renk="Sarı-Mavi";
            return renk;
        }
        
    }class SırtC extends Canta{
        
        public SırtC(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Sırt Çantası", "WWHG7", "22.50 TL", "Adidas");
        }
        @Override
        public void Tasi() {
            System.out.println("Sırt çantası ile taşınıyor ..");
        }   
        @Override
        public String RenkTipi(String renk) {
            renk="Kırmızı-Siyah";
            return renk;
        } 
        @Override
        public int DayanmaSüresiYıl() {
            return 3;
        }
        
    }class ResimC extends Canta{
        
        public ResimC(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Resim Çantası", "TTR43", "50 TL", "Puma");
        }

        @Override
        public void Tasi() {
            System.out.println("Sırt Çantası ile taşınıyor..");
        }
        
    }class LaptopC extends Canta {
        
        public LaptopC(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Laptop Çantası", "YYII4", "55.75 TL", "Adidas");
        }

        @Override
        public void Tasi() {
            System.out.println("Laptop Çantası ile taşınıyor..");
        }

        @Override
        public String RenkTipi(String renk) {
            renk="Gri";
            return renk;
        }
        
        
        
    }
}
