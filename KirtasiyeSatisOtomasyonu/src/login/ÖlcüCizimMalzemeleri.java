/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import İnterfaces.Dayanıklılık;
import İnterfaces.SekilCiz;

/**
 *
 * @author LENOVO
 */
public class ÖlcüCizimMalzemeleri extends Markalar implements SekilCiz,İnterfaces.CokluRenk,Dayanıklılık{
 
    public ÖlcüCizimMalzemeleri(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
        
    }
   public String DaireCiz(String hacim){
       return hacim;
   }
   public double CizgiCiz(double kaccm){
      return kaccm;
        }
   public String UcgenCiz(){
            return "";
        }
  public void TumSekilleriCiz(){
            
        }
    public void Olc(){
        
    }

    @Override
    public void UrunTani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void SekillerCiz() {
        System.out.println("İnterfaceden gelen zorunlu ezilen metod ..");
    }

    @Override
    public void RenkBelirle() {
        System.out.println("Kırmızı");
    }

    @Override
    public String RenkB() {
      return"";    
    }

    @Override
    public String RenkTipi(String renk) {
         return "";    }

    @Override
    public int DayanmaSüresiYıl() {
        return 1;
    }
    
    
class Pergel extends ÖlcüCizimMalzemeleri{

        public Pergel(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Pergel", "77OP2", "12.75 TL", "Faber Castel");
            
        } @Override
        public int DayanmaSüresiYıl() {
            return 3;
        }
        @Override
        public void RenkBelirle() {
            System.out.println("Turuncu");
        }
        @Override
        public void UrunTani() {
     System.out.println("Ürünün Adı : "+Adı+"Barkod : "+Barkod+"Fiyat : "+Fiyat+"Marka : "+Marka);
        }
        @Override
        public String DaireCiz(String hacim) {
            hacim="πr2";
            return hacim;
        }
    }class Gönye extends ÖlcüCizimMalzemeleri{
        
        public Gönye(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Gönye", "WWE55", Fiyat, Marka);
        }

        @Override
        public int DayanmaSüresiYıl() {
            return 3;
        }

        @Override
        public String RenkB() {
            return "Mavi";
        }
        @Override
        public String UcgenCiz() {
            return "Üçgen Çizildi!!";
        }

        @Override
        public void Olc() {
            System.out.println("Cisim ölçüldü..");        }

        @Override
        public void UrunTani() {
     System.out.println("Ürünün Adı : "+Adı+"Barkod : "+Barkod+"Fiyat : "+Fiyat+"Marka : "+Marka); }
  
    }class Cetvel extends ÖlcüCizimMalzemeleri{
        
        public Cetvel(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Cetvel", "XTRL7", "5.75 TL", "Rio");
        } 

        @Override
        public int DayanmaSüresiYıl() {
            return 10;
        }

        @Override
        public String RenkTipi(String renk) {
            renk="Gri";
            return renk;
        }

   
        @Override
        public void Olc() {
            System.out.println("Cisim ölçüldü..");        }

        @Override
        public void UrunTani() {
 System.out.println("Ürünün Adı : "+Adı+"Barkod : "+Barkod+"Fiyat : "+Fiyat+"Marka : "+Marka);}

        @Override
        public double CizgiCiz(double kaccm)
        {
            kaccm=7.82;
            return kaccm;
        }        
    }class Sablon extends ÖlcüCizimMalzemeleri{
        
        public Sablon(String Adı, String Barkod, String Fiyat, String Marka) {
            super("Şablon", "1112A", "14.75 TL", "Rübenis");
        }

        @Override
        public int DayanmaSüresiYıl() {
            return 15;
        }

        @Override
        public void RenkBelirle() {
            System.out.println("Sarı");        }

        @Override
        public void UrunTani() {
         System.out.println("Ürünün Adı : "+Adı+"Barkod : "+Barkod+"Fiyat : "+Fiyat+"Marka : "+Marka);
        }

        @Override
        public void Olc() {
            System.out.println("Şablon ile ölçüldü ..");
        }
        
        @Override
        public void TumSekilleriCiz() {
            System.out.println("Tüm şekilleri çizebilirim !!!");
        }
        
        
    }
}
