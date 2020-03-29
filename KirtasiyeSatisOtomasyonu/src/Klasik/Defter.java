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
public class Defter extends Markalar implements Dayanıklılık,İnterfaces.CokluRenk{

    public Defter(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void YaziKaydet(){}
    public void BilgiTasi(){} 
    public int sayfaSayisi(){
        return 100;}
    public String Cizgili(){ return "";       
    }public String Cizgisiz(){ return "";   
    }public String Telli(){ return "";
    }public String Düz(){ return "";
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
    class AjansD extends Defter{

        public AjansD(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Ajans Defteri", "ER56Z", "14.99 TL", "Mitos");
        }
        @Override
        public int sayfaSayisi() {
            return 127;
        }
        @Override
        public int DayanmaSüresiYıl() {
            return 2;
        }        
        @Override
        public String RenkB() {
            return "Kırmızı";
        }
        @Override
        public void BilgiTasi() {
            System.out.println("Bilgiler taşınıyor ..");
        }

        @Override
        public String Telli() {
            return "Telli";
        }
        @Override
        public String Cizgili() {
            return "Çizgili ";
        }
        
    }class NotD extends Defter{

        public NotD(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Not Defteri", "UU98Q", "10 TL", "Asist");
        }
           @Override
        public int sayfaSayisi() {
            return 144;
        }    @Override
        public int DayanmaSüresiYıl() {
            return 1;
        }        
        @Override
        public String RenkB() {
            return "Sarı-Mavi";
        }
        @Override
        public String Cizgili() {
            return "Çizgili";
        }
        @Override
        public void YaziKaydet() {
            System.out.println("Yazi kaydet..");
        }
        @Override
        public String Düz() {
            return "Düz";
        }
    }class OkulD extends Defter{
        
        public OkulD(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Okul Defteri","QEWTR", "12 TL", "Faber Castel");
        }
           @Override
        public int sayfaSayisi() {
            return 99;
        }   @Override
        public int DayanmaSüresiYıl() {
            return 3;
        }        
        @Override
        public String RenkB() {
            return "Yeşil";
        }

        @Override
        public String Cizgili() {
            return "Çizgili";
        }        
    }class ResimD extends Defter{
        
        public ResimD(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Resim Defteri","UIO88", "10 TL","Moleskine");
        }
           @Override
        public int sayfaSayisi() {
            return 50;
        }
        @Override
        public String Cizgisiz() {
            return "Çizgisiz";
        }
        
    }
}
