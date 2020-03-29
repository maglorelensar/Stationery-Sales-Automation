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
public class Silgi extends Markalar implements Dayanıklılık,İnterfaces.CokluRenk{

    public Silgi(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
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
return "";    }

    @Override
    public String RenkTipi(String renk) {
return "";    }
    
    public String Sil(){
        return "";
    }
        class  KokuluSilgi extends Silgi{
            
            public KokuluSilgi(String Adı, String Barkod, String Fiyat, String Marka) {
                super("Kokulu Silgi", "22UG0", "3 TL", "Micro");
            }
            @Override
            public String Sil() {
                return "Kokulu Silgiyle silindi";
            }

        @Override
        public String RenkB() {
            return "Beyaz";
        }

        @Override
        public int DayanmaSüresiYıl() {
            return 2;
        }
            
        }
class RenkliSilgi extends Silgi{
            
            public RenkliSilgi(String Adı, String Barkod, String Fiyat, String Marka) {
                super("Renkli Silgi", "RTBB2", "4 tl", "Faber Castel");
            }   @Override
            public String Sil() {
               return "Renkli Silgiyle Silindi";     }  
            @Override
        public int DayanmaSüresiYıl() {
            return 2;
        } @Override
        public String RenkB() {
            return "Siyah";
        }
                       
                    }
class SınavSilgisi extends Silgi{
            
            public SınavSilgisi(String Adı, String Barkod, String Fiyat, String Marka) {
                super("Sınav Silgisi", "IIOOP", "2 TL", "Faber Castel");
            }
              @Override
            public String Sil() {
               return "Sınav Silgiyle Silindi";  
            }  
            @Override
        public int DayanmaSüresiYıl() {
            return 2;
        } @Override
        public String RenkB() {
            return "Mavi";
        }
        }
}



