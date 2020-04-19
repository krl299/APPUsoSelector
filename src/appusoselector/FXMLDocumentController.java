/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 *
 * @author Carlos
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private SelectorDeslizamiento s1;
    @FXML
    private SelectorDeslizamiento s2;
    @FXML
    private Label seleccion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void sel1(ActionEvent event) {
        seleccion.setText("Pulsado el selector superior");
    }

    @FXML
    private void sel2(ActionEvent event) {
        seleccion.setText("Pulsado el selector inferior");
    }

}
