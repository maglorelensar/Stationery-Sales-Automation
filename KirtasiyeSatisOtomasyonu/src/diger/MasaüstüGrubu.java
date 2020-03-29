/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diger;

import login.Markalar;
import İnterfaces.CokluRenk;
import İnterfaces.Dayanıklılık;

/**
 *
 * @author LENOVO
 */
public class MasaüstüGrubu extends Markalar implements Dayanıklılık,CokluRenk{

    public MasaüstüGrubu(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void Kes(){       
    }public String Del(){
        return "";
    }public void Zımbala(){        
    }public void Tak(){        
    }   
    @Override
    public int DayanmaSüresiYıl() {
        return 5;
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
    }class DelgecZımba extends MasaüstüGrubu{

        public DelgecZımba(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Delgeç Zımba", "EER44", "10.50 TL", "Delta");
        }
    }class Makas extends MasaüstüGrubu{ 

        public Makas(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class MaketBicagi extends MasaüstüGrubu{

        public MaketBicagi(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class CöpKovasi extends MasaüstüGrubu{

        public CöpKovasi(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class Kalemlik extends MasaüstüGrubu{ 

        public Kalemlik(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class HesapMakinesi extends MasaüstüGrubu{ 

        public HesapMakinesi(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class Lastik extends MasaüstüGrubu{ 

        public Lastik(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class Bant extends MasaüstüGrubu{ 

        public Bant(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class Atas extends MasaüstüGrubu{ 

        public Atas(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class ZımbaTeli extends MasaüstüGrubu{

        public ZımbaTeli(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }class Kıskac extends MasaüstüGrubu{ 

        public Kıskac(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
    }
        
        
        
}
