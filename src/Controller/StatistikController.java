/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Stok;
import Model.StokList;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.css.CssMetaData;
import javafx.css.Styleable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author Pinta Raninda Meliala || 19523076
 */
public class StatistikController  {
 StokList stokList;
    XYChart.Series chart = new XYChart.Series<>();  
    int varJan = 0; int varAg = 0; int varApr = 0; int varDes= 0; int varFeb= 0; int varJul =0; 
        int varJun = 0; int varMar= 0; int varMei= 0; int varNov= 0; int varOkt= 0; int varSep = 0;
        
    @FXML
    private BarChart chartStatistik;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;



    /**
     * Initializes the controller class.
     * 
     */
    
    public void statistikData(){
              
        Iterator<Stok> itr;
        List<Stok> data = new ArrayList();
        stokList = new StokList();
        stokList.loadXMLFile();
        
        data = Arrays.asList(stokList.getArray());
        itr = data.iterator();
        
        while(itr.hasNext() == true){
            Stok st = itr.next();
            
            switch (st.getBulan()) {
                case "Januari":
                    varJan += st.getStock();
                    break;
                case "Februari":
                    varFeb += st.getStock();
                    break;
                case "Maret":
                    varMar += st.getStock();
                    break;
                case "April":
                    varApr += st.getStock();
                    break;
                case "Mei":
                    varMei += st.getStock();
                    break;
                case "Juni":
                    varJun += st.getStock();
                    break;
                case "Juli":
                    varJul += st.getStock();
                    break;
                case "Agustus":
                    varAg += st.getStock();
                    break;
                case "September":
                    varSep += st.getStock();
                    break;
                case "Oktober":
                    varOkt += st.getStock();
                    break;
                case "November":
                    varNov += st.getStock();
                    break;
                case "Desember":
                    varDes += st.getStock();
                    break;
                default:
                    break;
            }
        }
               chart.getData().add(new XYChart.Data<>("Januari", varJan)); 
               chart.getData().add(new XYChart.Data<>("Februari", varFeb));  
               chart.getData().add(new XYChart.Data<>("Maret", varMar));
               chart.getData().add(new XYChart.Data<>("April", varApr));
               chart.getData().add(new XYChart.Data<>("Mei", varMei));
               chart.getData().add(new XYChart.Data<>("Juni", varJun));
               chart.getData().add(new XYChart.Data<>("Juli", varJul));
               chart.getData().add(new XYChart.Data<>("Agustus", varAg));
               chart.getData().add(new XYChart.Data<>("September", varSep));
               chart.getData().add(new XYChart.Data<>("Oktober", varOkt));
               chart.getData().add(new XYChart.Data<>("November", varNov));
               chart.getData().add(new XYChart.Data<>("Desember", varDes));
               
               chartStatistik.getData().addAll(chart);
               
              // clear();
    }
     
    
  
    public void initialize(BerandaController beranda) {
        this.statistikData();
       
        // TODO
    }    


}
