/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author LENOVO
 */
abstract class  Ürünler {
    public String Adı;
    public String Barkod;
    public String Fiyat;
    public String  Marka;

    public Ürünler() {
    
    }   
    public Ürünler(String Adı, String Barkod, String Fiyat, String Marka) {
        this.Adı = Adı;
        this.Barkod = Barkod;
        this.Fiyat = Fiyat;
        this.Marka = Marka;
    }

    public abstract void UrunTani();
       
    
    public String getAdı() {
        return Adı;
    }

    public void setAdı(String Adı) {
        this.Adı = Adı;
    }

    public String getBarkod() {
        return Barkod;
    }

    public void setBarkod(String Barkod) {
        this.Barkod = Barkod;
    }

    public String getFiyat() {
        return Fiyat;
    }

    public void setFiyat(String Fiyat) {
        this.Fiyat = Fiyat;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }
    
}
