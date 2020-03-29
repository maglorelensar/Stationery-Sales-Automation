/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanatsal;

import login.Markalar;

/**
 *
 * @author LENOVO
 */
public class Yapistirici extends Markalar{

    public Yapistirici(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public String Yapistir(){   
        return "";
    }public String Sür(){
        return "";
    }public String Sık(String sık){
        return sık;
    }class SürmeliY extends Yapistirici{

        public SürmeliY(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        @Override
        public String Sür() {
            return "Sürüldü";
        }

        @Override
        public void UrunTani() {
            super.UrunTani(); //To change body of generated methods, choose Tools | Templates.
        }
        @Override
        public String Yapistir() {
            return "Yapıştırıldı";
        }                
    }class SikmaliY extends Yapistirici{

        public SikmaliY(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }
        @Override
        public String Sık(String sık) {
            return "Sıkılıor..";
        }        
    }
}
