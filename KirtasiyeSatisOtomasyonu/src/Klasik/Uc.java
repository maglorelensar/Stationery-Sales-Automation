package Klasik;

import login.Markalar;
import İnterfaces.Dayanıklılık;

public class Uc extends Markalar implements Dayanıklılık,İnterfaces.CokluRenk{

    public Uc(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void KalemeTak(){
     }
    @Override
    public int DayanmaSüresiYıl() {
        return 2;
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
class SıfırYedi extends Uc{  
        public SıfırYedi(String Adı, String Barkod, String Fiyat, String Marka) {
            super("SıfırYedi Uc", "PP33U", "1.5 TL", "Micro");
        }
          @Override
    public String RenkTipi(String renk) {
        renk="Siyah";
        return renk;
    }
        @Override
        public int DayanmaSüresiYıl() {
            return 3;
        }
        @Override
        public void KalemeTak() {
            System.out.println("0.7 uc kaleme takıldı!!");
        }    
    }class SıfırBes extends Uc {
    
        public SıfırBes(String Adı, String Barkod, String Fiyat, String Marka) {
            super("SıfırBeş Uc", "SSG76", "1 TL", "Faber Castel");
        }
         @Override
    public String RenkTipi(String renk) {
        renk="Siyah";
        return renk;}
    
        @Override
        public int DayanmaSüresiYıl() {
            return 3;
        }
        @Override
        public void KalemeTak() {
            System.out.println("0.5 uc Kaleme takıldı..");
        }
    
}
}
