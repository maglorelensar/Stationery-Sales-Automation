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
public class Boya extends Markalar {

    public Boya(String Adı, String Barkod, String Fiyat, String Marka) {
        super(Adı, Barkod, Fiyat, Marka);
    }
    public void Boya(){
    }
    class PastelB extends Boya{

        public PastelB(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }

        @Override
        public void Boya() {
            System.out.println("Pastel boya ile boyandı");        }
        
    }class KuruB extends Boya{

        public KuruB(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }

        @Override
        public void Boya() {
            System.out.println("Kuru boya ile boyandı");
        }
        
    }class SuluB extends Boya{

        public SuluB(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }

        @Override
        public void Boya() {
            System.out.println("Sulu boya ile boyandı");
        }
        
    }class YaglıB extends Boya{

        public YaglıB(String Adı, String Barkod, String Fiyat, String Marka) {
            super(Adı, Barkod, Fiyat, Marka);
        }

        @Override
        public void Boya() {
            System.out.println("Yağlı boya ile boyandı");        }
        
    }
}
