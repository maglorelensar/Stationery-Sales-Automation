/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diger;

import login.Markalar;
import İnterfaces.Dayanıklılık;

/**
 *
 * @author LENOVO
 */
public class DosyaKlasörler extends Markalar implements Dayanıklılık,İnterfaces.CokluRenk{

    public DosyaKlasörler(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void VeriSakla(){
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
    }
    
}class Lastikli extends DosyaKlasörler{
    
    public Lastikli(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    
}class PosetD extends DosyaKlasörler{
    
    public PosetD(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    
}class SunumD extends DosyaKlasörler{
    
    public SunumD(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    
}class TelliD extends DosyaKlasörler{
    
    public TelliD(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    
}class Seperator extends DosyaKlasörler{
    
    public Seperator(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    
}class Citcitli extends DosyaKlasörler{
    
    public Citcitli(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    
}
