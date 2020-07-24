/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author Supandi || 19523136
 */
public class Stok {
     private String kecamatan;
     private String komoditas;
     private int stock;
     private String bulan;

    public Stok(String kecamatan, String komoditas, int stock, String bulan) {
        this.kecamatan = kecamatan;
        this.komoditas = komoditas;
        this.stock = stock;
        this.bulan = bulan;
    }
    
    public Stok(){
        this.kecamatan = "";
        this.komoditas = "";
        this.stock = 0;
        this.bulan ="";
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKomoditas() {
        return komoditas;
    }

    public void setKomoditas(String komoditas) {
        this.komoditas = komoditas;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }
     
    
}
