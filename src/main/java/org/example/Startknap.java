package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Data.Temperatursensor;

public class Startknap {
    Temperatursensor temp = new Temperatursensor();
    public Startknap(){

    }



    @FXML
    Label temperaturlabel;
    @FXML
    TextField ovretekstfelt;
    @FXML
    TextField nedretekstfelt;

    public void togglesensor(){
        double lowerlimit = Double.parseDouble(nedretekstfelt.getText());
        double upperlimit = Double.parseDouble(ovretekstfelt.getText());
        temp.setLowerlimit(lowerlimit);
        temp.setUpperlimit(upperlimit);
      temperaturlabel.setText("Temperatur:"+temp.getValue());
    }
}
