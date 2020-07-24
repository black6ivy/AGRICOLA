/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.beans.property.*;


/**
 *
 * @author Raja Rivaldi Ardiansyah || 19523209
 */
public class StokProperty {
    private SimpleStringProperty kecamatan;
    private SimpleStringProperty komoditas;
    private SimpleIntegerProperty stock;
    private SimpleStringProperty bulan;

    
    public StokProperty(String kecamatan, String komoditas, int stock, String bulan){
        this.kecamatan = new SimpleStringProperty(kecamatan);
        this.komoditas = new SimpleStringProperty(komoditas);
        this.stock = new SimpleIntegerProperty(stock);
        this.bulan = new SimpleStringProperty(bulan);
    }
    
    public StokProperty(){
        this("","",0,"");
    }
    
    public StringProperty getKecamatanProperty(){
        return kecamatan;
    }
    public String getKecamatan() {
        return this.kecamatan.get();
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan.set(kecamatan);
    }
    
    public StringProperty getKomoditasProperty(){
        return komoditas;
    }

    public String getKomoditas() {
        return this.komoditas.get();
    }

    public void setKomoditas(String komoditas) {
        this.komoditas.set(komoditas);
    }
    
    public IntegerProperty getStockProperty(){
        return stock;
    }
    public int getStock() {
        return this.stock.get();
    }

    public void setStock(int stock) {
        this.stock.set(stock);
    }
    
    public StringProperty getBulanProperty(){
        return bulan;
    }

    public String getBulan() {
        return this.bulan.get();
    }

    public void setBulan(String bulan) {
        this.bulan.set(bulan);
    }

}
