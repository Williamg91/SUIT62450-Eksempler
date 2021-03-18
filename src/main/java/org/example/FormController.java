package org.example;

import java.io.IOException;

import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;
import javafx.stage.Popup;
import javafx.stage.Window;


public class FormController {

    @FXML
    public Button knappen;
    public Label hilsen;
    @FXML
    private TextField mailfield;

    @FXML
    private PasswordField passwordfield;
//hvis en attribut er public og deler navn med en attribut i en FXML fil - Så behøver man ikke @FXML
    //
    public TextField textField;
    public Polyline polyline;


    ThreadExtended te = new ThreadExtended(Math.random()*3000);

    public void trykPaaKnap(){
        //System.out.println("Du har trykket :))");

        //hilsen.setText("Er du trykket ned? :(");
        if(te.isAlive()){

            te.interrupt();
            hilsen.setText("Tråd pauset");
        } else{
            te.start();
            hilsen.setText("Tråd kører");

        }
    }


    public void showMainMenu() throws IOException {
        App.setRoot("Doctorview");


    }

    public void logintoMainScreen(ActionEvent actionEvent) {
        try {

            System.out.println(passwordfield.getText());
            System.out.println(mailfield.getText());;
            String password ="password";
            if(passwordfield.getText().contains(password)){
                System.out.println("hej");

            }
            else{
                App.setRoot("primary");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeContent(MouseEvent mouseEvent) {
        String content = mailfield.getText();
        if (content.contains("-")&&content.length()==11){
            System.out.println(content);
        }

        //skriv en listener, der brokker sig, hvis brugeren har indtastet password eller ikke skrevet korrekt
        //CPR nummer
        if(!content.contains("-")){
            Popup popup = new Popup();

        }
    }
}
