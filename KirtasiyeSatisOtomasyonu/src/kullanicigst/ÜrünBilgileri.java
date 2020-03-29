/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicigst;

import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author LENOVO
 */
public class ÜrünBilgileri {
    private SimpleStringProperty id,urunadi,barkod,stok,saat,adeet,fiyaat,tariih;  
    private int adet;
    private double fiyat;
    private LocalDate tarih;
    private String tutar;

    public ÜrünBilgileri() {
    }

    public ÜrünBilgileri(String id, String barkod, String urunadi, String stok, String saat, String adeet, String fiyaat, String tariih) {
        this.id = new SimpleStringProperty(id);
        this.barkod = new SimpleStringProperty(barkod);
        this.urunadi =new SimpleStringProperty(urunadi);
        this.stok = new SimpleStringProperty(stok);
        this.saat = new SimpleStringProperty(saat);
        this.adeet =new  SimpleStringProperty(adeet);
        this.fiyaat = new SimpleStringProperty(fiyaat);
        this.tariih = new SimpleStringProperty(tariih);
    }

    public ÜrünBilgileri(String text, String text0, String value, String text1, Object value0, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public String getTariih() {
        return tariih.get();
    }

    public void setTariih(String tariih) {
       this.id=new SimpleStringProperty(tariih);

    }

    public String getId() {
        return id.get();
    }

    public void setId(String id) {
         this.id=new SimpleStringProperty(id);
    }

    public String getBarkod() {
        return barkod.get();
    }

    public void setBarkod(String barkod) {
        this.barkod = new SimpleStringProperty(barkod);
    }

    public String getUrunadi() {
        return urunadi.get();
    }

    public void setUrunadi(String urunadi) {
         this.id=new SimpleStringProperty(urunadi);

    }

    public String getStok() {
        return stok.get();
    }

    public void setStok(String stok) {
        this.id=new SimpleStringProperty(stok);

    }

    public String getSaat() {
        return saat.get();
    }

    public void setSaat(String saat) {
         this.id=new SimpleStringProperty(saat);

    }

    public String getAdeet() {
        return adeet.get();
    }

    public void setAdeet(String adeet) {
       this.id=new SimpleStringProperty(adeet);

    }

    public String getFiyaat() {
        return fiyaat.get();
    }

    public void setFiyaat(String fiyaat) {
        this.id=new SimpleStringProperty(fiyaat);

    }




    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        this.tutar = tutar;
    }

 


    
    
}
