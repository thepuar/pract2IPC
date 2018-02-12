/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2ipc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;

/**
 *
 * @author thepu
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private GridPane gridPane;
    @FXML
    private Circle circle;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void teclaLevantada(KeyEvent event) {
         Integer numCol = GridPane.getColumnIndex(circle);
        Integer numRow = GridPane.getRowIndex(circle);
        System.out.println("NumCol "+numCol);
       
        if(event.getCode() == KeyCode.UP){
            if(numRow>0)
           GridPane.setRowIndex(circle, numRow-1);
           
        }else if(event.getCode() == KeyCode.DOWN){
           if(numRow<4)
         GridPane.setRowIndex(circle, numRow+1);
        }else if(event.getCode() == KeyCode.LEFT){
           if(numCol>0)
             GridPane.setColumnIndex(circle, numCol-1);
        }else if(event.getCode() == KeyCode.RIGHT){
            if(numCol<4)
             GridPane.setColumnIndex(circle, numCol+1);
        
        }
    }
}
