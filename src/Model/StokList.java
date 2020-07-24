/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Thalia Maharani || 19523022
 */
public class StokList {
    private ObservableList<StokProperty> list;
    private String stokFile;
    
    public StokList(){
        list = FXCollections.observableArrayList();
        stokFile = "stokData.xml";
    }
    
    // ambil data dari observable list 
    public ObservableList<StokProperty> get(){
        return this.list;
    }

    // akses file xml, untuk input data baru variable biasa
    public void setFromArray(Stok[] array){
        list = FXCollections.observableArrayList();
        
        for(Stok s : array){
            list.add(new StokProperty(s.getKecamatan(),s.getKomoditas(),s.getStock(),s.getBulan()));
        }
    }
    
    public void setData(String kecamatan, String komoditas,int stock, String bulan){
        list.add(new StokProperty(kecamatan, komoditas, stock, bulan));
    }
    
    //  xstream masukin array lalu diubah jadi property lalu dimasukan ke tabel;
    public void loadXMLFile(){

    try {
     XStream xs = new XStream(new StaxDriver());
     FileInputStream in = new FileInputStream(stokFile);
     
     String s = "";
     int i = in.read();
     
        while(i != -1){
         s += (char) i;
         i = in.read();
        }
     Stok[] array = (Stok[]) xs.fromXML(s);
     this.setFromArray(array);
    }catch(Exception e){
        e.printStackTrace();
    }
    
    }
    
    
    // untuk dapat data dalam bentuk array
    public Stok[] getArray(){
       
       StokProperty stok = new StokProperty();
        
        Stok[] array = new Stok[list.size()];
        for(int i = 0; i < list.size(); i++){
           String kecamatan = list.get(i).getKecamatan();
           String komoditas = list.get(i).getKomoditas();
           int stock = list.get(i).getStock();
           String bulan = list.get(i).getBulan();
           array[i] = new Stok(kecamatan, komoditas, stock, bulan);         
        }
        System.out.println(array);
    return array;
}
    
    //function buat menyimpan file ke xml, ubah array ke dalam format xml lalu ubah dimasukan ke string
    public void saveXMLFile(){
      Stok[] array = this.getArray();
      System.out.println(Arrays.toString(array));
      XStream xs = new XStream(new StaxDriver());

      try{
          FileOutputStream output = new FileOutputStream(stokFile);
          String xml = xs.toXML(array);
          byte[] bytes = xml.getBytes("UTF-8");
          output.write(bytes);
          output.close();
          
      }catch(Exception e){
          e.printStackTrace(); 
      }   
        System.out.println("berhasil disimpan");
    
    }
}