/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.StokList;
import Model.StokProperty;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

/**
 *
 * @author Thalia Maharani || 19523022
 */
public class BerandaController implements Initializable {
    StokList stokList;
    XYChart.Series chart = new XYChart.Series<>();
        int varJan = 0; int varAg = 0; int varApr = 0; int varDes= 0; int varFeb= 0; int varJul =0; 
        int varJun = 0; int varMar= 0; int varMei= 0; int varNov= 0; int varOkt= 0; int varSep = 0;

    
    // Properti halaman beranda 
    @FXML
    private Label label;
 
    @FXML
    private TableView<StokProperty> tabelStok;

    @FXML
    private TableColumn<StokProperty, String> kecamatanColumn;

    @FXML
    private TableColumn<StokProperty, String> komoditasColumn;

    @FXML
    private TableColumn<StokProperty, Integer> stokColumn;
    
    @FXML
    private TableColumn<StokProperty, String> bulanColumn;
     
    // properti tambah data
        @FXML
    private Pane tambahPage;

    @FXML
    private TextField kecamatanField;

    @FXML
    private TextField komoditasField;

    @FXML
    private TextField stokField;

    @FXML
    private ChoiceBox chBulan;
    
    // properti statistik
    
    
    @FXML
    private Pane statistikPage;

    @FXML
    private BarChart bcChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;
    
    @FXML
    void BerandaButton(ActionEvent event) {
        tambahPage.setVisible(false);
      //  statistikPage.setVisible(false);
    }
   

    @FXML
    void HapusButton(ActionEvent event) {
        int selectedIndex = tabelStok.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
           tabelStok.getItems().remove(selectedIndex);
           
        } else {
            // Jika gak ada yang dipilih
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Tidak ada pilihan");
            alert.setHeaderText("Belum ada order yang dipilih");
            alert.setContentText("Pilih order pada tabel");
            alert.showAndWait();
        }
        stokList.saveXMLFile();
    }
    
    @FXML
    void TambahButton(ActionEvent event) {
        tambahPage.setVisible(true);
        this.clear();
    }

    @FXML
    void NextButton (ActionEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Statistik.fxml"));
            Parent root = (Parent) loader.load();
            
            StatistikController statCont = loader.getController();
            statCont.statistikData();
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Statistik Stok Bahan Pangan");
            stage.show();    
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    // halaman tambah data
    @FXML
    void simpanButton(ActionEvent event) {
        if(chBulan.getValue().equals("Januari")){
                    // mengisi object value
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    
                    
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");                   
                }else if(chBulan.getValue().equals("Februari")){
                    // mengisi object value
                   StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    // masukin value ke datastoklist
                
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                }else if (chBulan.getValue().equals("Maret")){
                    // mengisi object value
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("April")){
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("Mei")){
                    // mengisi object value
                   StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("Juni")){
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("Juli")){
                    // mengisi object value
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("Agustus")){
                    // mengisi object value
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if (chBulan.getValue().equals("September")){
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("Oktober")){
                   StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                }else if(chBulan.getValue().equals("November")){
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                    
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                    
                    
                }else if(chBulan.getValue().equals("Desember")){
                    StokProperty stok =  new StokProperty();
                    stok.setKecamatan(kecamatanField.getText());
                    stok.setKomoditas(komoditasField.getText());
                    stok.setStock(Integer.parseInt(stokField.getText()));
                    stok.setBulan(chBulan.getValue().toString());
                     
                    tabelStok.getItems().add(stok);
                    stokList.saveXMLFile();
                    tambahPage.setVisible(false);
                    System.out.println("Data baru telah disimpan");
                }
    }

    @FXML
    void editKecamatan(TableColumn.CellEditEvent<StokProperty, String> editKecamatan) {
    //untuk mengedit di klik kolomnya jadi ini sebagai pointer klik kolom mana
     StokProperty kecamatanSelected = tabelStok.getSelectionModel().getSelectedItem();
     // edit data
     kecamatanSelected.setKecamatan(editKecamatan.getNewValue());
     stokList.saveXMLFile();        
    }

    @FXML
    void editKomoditas(TableColumn.CellEditEvent<StokProperty, String> editKomoditas) {
    //untuk mengedit di klik kolomnya jadi ini sebagai pointer klik kolom mana
     StokProperty komoditasSelected = tabelStok.getSelectionModel().getSelectedItem();
     // edit data
     komoditasSelected.setKomoditas(editKomoditas.getNewValue());
     stokList.saveXMLFile();
    }

    @FXML
    void editStok(TableColumn.CellEditEvent<StokProperty, Integer> editStok) {
     //untuk mengedit di klik kolomnya jadi ini sebagai pointer klik kolom mana
      StokProperty stokSelected = tabelStok.getSelectionModel().getSelectedItem();
     // edit data
     stokSelected.setStock(editStok.getNewValue());
     stokList.saveXMLFile();
    }

    void clear(){
        //untuk menghapus inputan setelah melakukan aksi
        kecamatanField.clear();
        stokField.clear();
        komoditasField.clear();
        varJan = 0; varAg = 0; varApr = 0; varDes= 0; varFeb= 0; varJul =0; 
        varJun = 0; varMar= 0; varMei= 0; varNov= 0; varOkt= 0; varSep = 0; 
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stokList = new StokList();
        stokList.loadXMLFile();

        //dapetkan data dri xml
        tambahPage.setVisible(false);

        chBulan.setValue("Januari");
        chBulan.getItems().addAll("Januari","Februari","Maret", "April", "Mei","Juni","Juli",
                                    "Agustus", "September","Oktober","November","Desember");

        tabelStok.setItems(stokList.get());
        kecamatanColumn.setCellValueFactory(cellData -> cellData.getValue().getKecamatanProperty());
        komoditasColumn.setCellValueFactory(cellData -> cellData.getValue().getKomoditasProperty());
        stokColumn.setCellValueFactory(cellData -> cellData.getValue().getStockProperty().asObject());
        bulanColumn.setCellValueFactory(cellData -> cellData.getValue().getBulanProperty());

        // agar kolom bisa di klik terus dijadiin textfield buat edit
        tabelStok.setEditable(true);
        kecamatanColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        komoditasColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        stokColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

    }
}